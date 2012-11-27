/*
 * Copyright (c) 2012 Marsha Chechik, Alessio Di Sandro, Michalis Famelis,
 * Rick Salay, Vivien Suen.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Alessio Di Sandro, Vivien Suen - Implementation.
 */
package edu.toronto.cs.se.modelepedia.randommodel.operator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import org.eclipse.emf.common.util.EList;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Structure;

import edu.toronto.cs.se.mmtf.MultiModelTypeRegistry;
import edu.toronto.cs.se.mmtf.mavo.MAVOElement;
import edu.toronto.cs.se.mmtf.mid.Model;
import edu.toronto.cs.se.mmtf.mid.operator.impl.OperatorExecutableImpl;
import edu.toronto.cs.se.mmtf.mid.trait.MultiModelOperatorUtils;
import edu.toronto.cs.se.modelepedia.randommodel.NamedElement;
import edu.toronto.cs.se.modelepedia.randommodel.operator.Z3SMTSolver.CLibrary.Z3Result;

public class Z3SMTSolver extends OperatorExecutableImpl {

	private static final String Z3_LIBRARY_NAME = "z3";
	private static final String OPERATOR_LIBRARY_NAME = "Z3SMTSolver";
	private static final String LIBRARY_PATH = "/usr/lib";
	private static final String PREVIOUS_OPERATOR_URI = "http://se.cs.toronto.edu/modelepedia/Operator_RandomModelToSMTLIB";
	private static final String PROPERTY_OUT_TIMEMAVO = "timeMAVO";
	private static final String PROPERTY_OUT_TIMESTANDARDMAYBE = "timeStandardMaybe";
	private static final String PROPERTY_OUT_TIMESTANDARDALL = "timeStandardAll";
	private static final String PROPERTY_OUT_TIMEMAVOBACKBONE = "timeBackbone";
	private static final String PROPERTY_OUT_FLAGS = "flags";
	private static final String PROPERTY_OUT_SPEEDUPMAVOSTANDARD = "speedupMAVOStandard";

	public final static String SMTLIB_PREDICATE_START = "(";
	public final static String SMTLIB_PREDICATE_END = ")";
	public final static String SMTLIB_TRUE = " true ";
	public final static String SMTLIB_FALSE = " false ";
	public final static String SMTLIB_ASSERT = SMTLIB_PREDICATE_START + "assert";
	public final static String SMTLIB_AND = SMTLIB_PREDICATE_START + "and";
	public final static String SMTLIB_OR = SMTLIB_PREDICATE_START + "or";
	public final static String SMTLIB_NOT = SMTLIB_PREDICATE_START + "not";
	private final static String SMTLIB_ENCODING_POSTAMBLE = "\n(check-sat)";

	private long timeMAVO;
	private long timeStandardMaybe;
	private long timeStandardAll;
	private long timeMAVOBackbone;
	private StringBuilder flags;
	private double speedupMAVOStandard;

	public interface CLibrary extends Library {

		CLibrary Z3_INSTANCE = (CLibrary) Native.loadLibrary(Z3_LIBRARY_NAME, CLibrary.class);
		CLibrary OPERATOR_INSTANCE = (CLibrary) Native.loadLibrary(OPERATOR_LIBRARY_NAME, CLibrary.class);

		public class Z3Result extends Structure {

			public int flag;
			public String model;

			@Override
			@SuppressWarnings("rawtypes")
			protected List getFieldOrder() {
				List<String> fields = new ArrayList<String>();
				fields.add("flag");
				fields.add("model");
				return fields;
			}
		}

		int checkSat(String smtEncoding);
		Z3Result checkSatAndGetModel(String smtEncoding, String[] mayModelObjs);
		void freeResult(Z3Result result);
	}

	private void readProperties(Properties properties) throws Exception {

	}

	private void initOutput(HashSet<String> smtlibConcretizations) {

		timeMAVO = 0;
		timeStandardMaybe = 0;
		timeStandardAll = 0;
		timeMAVOBackbone = 0;
		flags = new StringBuilder((smtlibConcretizations.size() + 2) * 3);
		speedupMAVOStandard = 0;
	}

	private void writeProperties(Properties properties) {

		properties.setProperty(PROPERTY_OUT_TIMEMAVO, String.valueOf(timeMAVO));
		properties.setProperty(PROPERTY_OUT_TIMESTANDARDMAYBE, String.valueOf(timeStandardMaybe));
		properties.setProperty(PROPERTY_OUT_TIMESTANDARDALL, String.valueOf(timeStandardAll));
		properties.setProperty(PROPERTY_OUT_TIMEMAVOBACKBONE, String.valueOf(timeMAVOBackbone));
		properties.setProperty(PROPERTY_OUT_FLAGS, flags.toString());
		properties.setProperty(PROPERTY_OUT_SPEEDUPMAVOSTANDARD, String.valueOf(speedupMAVOStandard));
	}

	private void doMAVOPropertyCheck(String smtlibMavoEncoding, String property) {

		int z3Result;
		String finalEncoding;

		long startTime = System.nanoTime();
		finalEncoding = smtlibMavoEncoding + SMTLIB_ASSERT + property + SMTLIB_PREDICATE_END + SMTLIB_ENCODING_POSTAMBLE;
		z3Result = CLibrary.OPERATOR_INSTANCE.checkSat(finalEncoding);
		flags.append(z3Result);
		flags.append(',');
		finalEncoding = smtlibMavoEncoding + SMTLIB_ASSERT + SMTLIB_NOT + property + SMTLIB_PREDICATE_END + SMTLIB_PREDICATE_END + SMTLIB_ENCODING_POSTAMBLE;
		z3Result = CLibrary.OPERATOR_INSTANCE.checkSat(finalEncoding);
		flags.append(z3Result);
		flags.append(',');
		long endTime = System.nanoTime();

		timeMAVO = endTime - startTime;
	}

	private void doNonMAVOPropertyCheck(String smtlibEncoding, String property, HashSet<String> smtlibConcretizations) {

		int z3Result, firstZ3Result = 0;
		String finalEncoding;
		long endTimeMaybe = 0;

		long startTime = System.nanoTime();
		Iterator<String> iter = smtlibConcretizations.iterator();
		while (iter.hasNext()) {
			String concretization = iter.next();
			finalEncoding = smtlibEncoding + SMTLIB_ASSERT + concretization + SMTLIB_PREDICATE_END + '\n' + SMTLIB_ASSERT + property + SMTLIB_PREDICATE_END + SMTLIB_ENCODING_POSTAMBLE;
			z3Result = CLibrary.OPERATOR_INSTANCE.checkSat(finalEncoding);
			if (endTimeMaybe == 0) {
				if (firstZ3Result == 0) {
					firstZ3Result = z3Result;
				}
				if (z3Result == 0 || (z3Result != firstZ3Result)) {
					endTimeMaybe = System.nanoTime();
				}
			}
			flags.append(z3Result);
			flags.append(',');
		}
		long endTime = System.nanoTime();

		timeStandardAll = endTime - startTime;
		timeStandardMaybe = (endTimeMaybe == 0) ? timeStandardAll : (endTimeMaybe - startTime);
	}

	private void doMAVOBackbonePropertyCheck(String smtlibMavoEncoding, String property, List<MAVOElement> mayModelObjs, RandomModelToSMTLIB previousOperator) {

		Z3Result z3Result;
		String finalEncoding;

		long startTime = System.nanoTime();
		for (MAVOElement mayModelObj : mayModelObjs) {
			finalEncoding = smtlibMavoEncoding + SMTLIB_ASSERT + previousOperator.getNamedElementSMTLIBEncoding((NamedElement) mayModelObj) + SMTLIB_PREDICATE_END + SMTLIB_ASSERT + property + SMTLIB_PREDICATE_END + SMTLIB_ENCODING_POSTAMBLE;
			z3Result = CLibrary.OPERATOR_INSTANCE.checkSatAndGetModel(finalEncoding, new String[] {"aa", "bb"});
			flags.append(z3Result.flag);
			flags.append(',');
			if (z3Result.flag == -1) {
				CLibrary.OPERATOR_INSTANCE.freeResult(z3Result);
				continue;
			}
			CLibrary.OPERATOR_INSTANCE.freeResult(z3Result);
			finalEncoding = smtlibMavoEncoding + SMTLIB_ASSERT + SMTLIB_NOT + previousOperator.getNamedElementSMTLIBEncoding((NamedElement) mayModelObj) + SMTLIB_PREDICATE_END + SMTLIB_PREDICATE_END + SMTLIB_ASSERT + property + SMTLIB_PREDICATE_END + SMTLIB_ENCODING_POSTAMBLE;
			z3Result = CLibrary.OPERATOR_INSTANCE.checkSatAndGetModel(finalEncoding, new String[] {"aa", "bb", "cc"});
			flags.append(z3Result.flag);
			flags.append(',');
			//TODO MMTF: do we need to try !property too?
			//TODO MMTF: optimizations if result == 1?
			CLibrary.OPERATOR_INSTANCE.freeResult(z3Result);
		}
		long endTime = System.nanoTime();

		timeMAVOBackbone = endTime - startTime;
	}

	@Override
	public EList<Model> execute(EList<Model> actualParameters) throws Exception {

		Model randommodelModel = actualParameters.get(0);
		Properties inputProperties = MultiModelOperatorUtils.getPropertiesFile(
			this,
			randommodelModel,
			null,
			MultiModelOperatorUtils.INPUT_PROPERTIES_SUFFIX
		);
		readProperties(inputProperties);

		// get output from previous operator
		RandomModelToSMTLIB previousOperator = (RandomModelToSMTLIB) MultiModelTypeRegistry.getOperatorType(PREVIOUS_OPERATOR_URI).getExecutable();
		List<MAVOElement> mayModelObjs = previousOperator.getMayModelObjects();
		final String smtlibEncoding = previousOperator.getSMTLIBEncoding();
		final String smtlibMavoEncoding = previousOperator.getSMTLIBMAVOEncoding();
		HashSet<String> smtlibConcretizations = previousOperator.getSMTLIBConcretizations();
		final String property = previousOperator.getGroundedProperty();

		// run solver
		initOutput(smtlibConcretizations);
		System.setProperty("jna.library.path", LIBRARY_PATH);
		doMAVOPropertyCheck(smtlibMavoEncoding, property);
		//doMAVOBackbonePropertyCheck(smtlibMavoEncoding, property, mayModelObjs, previousOperator);
		doNonMAVOPropertyCheck(smtlibEncoding, property, smtlibConcretizations);
		speedupMAVOStandard = ((double) timeStandardMaybe) / timeMAVO;

		// save execution times
		Properties outputProperties = new Properties();
		writeProperties(outputProperties);
		MultiModelOperatorUtils.writePropertiesFile(
			outputProperties,
			this,
			randommodelModel,
			MultiModelOperatorUtils.getSubdir(inputProperties),
			MultiModelOperatorUtils.OUTPUT_PROPERTIES_SUFFIX
		);

		return actualParameters;
	}

}