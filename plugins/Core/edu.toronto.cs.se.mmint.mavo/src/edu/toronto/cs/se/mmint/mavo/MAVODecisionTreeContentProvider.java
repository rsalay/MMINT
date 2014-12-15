/**
 * Copyright (c) 2012-2014 Marsha Chechik, Alessio Di Sandro, Michalis Famelis,
 * Rick Salay, Naama Ben-David.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Naama Ben-David - Initial implementation.
 *    Alessio Di Sandro - Revision.
 */
package edu.toronto.cs.se.mmint.mavo;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;

import edu.toronto.cs.se.mavo.MAVOAlternative;
import edu.toronto.cs.se.mavo.MAVODecision;
import edu.toronto.cs.se.mavo.MAVOElement;
import edu.toronto.cs.se.mavo.MAVOModel;
import edu.toronto.cs.se.mavo.MayDecision;
import edu.toronto.cs.se.mavo.VarDecision;

public class MAVODecisionTreeContentProvider extends AdapterFactoryContentProvider {

	public MAVODecisionTreeContentProvider(AdapterFactory adapterFactory) {

		super(adapterFactory);
	}

	private List<Object> getLegacyMAVOElements(MAVOModel mavoModel) {

		List<Object> mavoModelObjs = new ArrayList<Object>();
		TreeIterator<EObject> iter = mavoModel.eAllContents();
		while (iter.hasNext()) {
			Object modelObj = iter.next();
			if (!(modelObj instanceof MAVOElement)) {
				continue;
			}
			MAVOElement mavoModelObj = (MAVOElement) modelObj;
			if (
				(mavoModelObj.isMay() || mavoModelObj.isSet() || mavoModelObj.isVar()) &&
				mavoModelObj.getAlternatives().isEmpty()
			) {
				mavoModelObjs.add(mavoModelObj);
			}
		}

		return mavoModelObjs;
	}

	@Override
	public boolean hasChildren(Object object) {

		boolean hasChildren = false;
		if (object instanceof MAVOModel) {
			if (
				!((MAVOModel) object).getDecisions().isEmpty() ||
				!getLegacyMAVOElements((MAVOModel) object).isEmpty()
			) {
				hasChildren = true;
			}
		}
		else if (object instanceof MAVODecision) {
			if (object instanceof MayDecision) {
				if (!((MayDecision) object).getAlternatives().isEmpty()) {
					hasChildren = true;
				}
			}
			else if (object instanceof VarDecision) {
				if (((VarDecision) object).getDomain() != null) {
					hasChildren = true;
				}
			}
		}
		else if (object instanceof MAVOAlternative) {
			if (!((MAVOAlternative) object).getMavoElements().isEmpty()) {
				hasChildren = true;
			}
		}

		return hasChildren;
	}

	@Override
	public Object[] getElements(Object inputElement) {

		return getChildren(inputElement);
	}

	@Override
	public Object[] getChildren(Object object) {

		Object[] children = new Object[] {};
		if (object instanceof Resource) {
			children = new Object[] {((Resource) object).getContents().get(0)};
		}
		else if (object instanceof MAVOModel) {
			List<Object> childrenList = new ArrayList<Object>(((MAVOModel) object).getDecisions());
			childrenList.addAll(getLegacyMAVOElements((MAVOModel) object));
			children = childrenList.toArray();
		}
		else if (object instanceof MAVODecision) {
			if (object instanceof MayDecision) {
				children = ((MayDecision) object).getAlternatives().toArray();
			} else if (object instanceof VarDecision) {
				children = new Object[] {((VarDecision) object).getDomain()};
			}
		}
		else if (object instanceof MAVOAlternative) {
			children = ((MAVOAlternative) object).getMavoElements().toArray();
		}

		return children;
	}

}
