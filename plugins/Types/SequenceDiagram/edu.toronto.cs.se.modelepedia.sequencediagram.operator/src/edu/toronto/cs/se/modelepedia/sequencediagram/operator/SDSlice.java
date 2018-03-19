/**
 * Copyright (c) 2012-2017 Marsha Chechik, Alessio Di Sandro, Michalis Famelis,
 * Rick Salay, Nick Fung.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Alessio Di Sandro - Implementation.
 *    Nick Fung - Implementation.
 */
package edu.toronto.cs.se.modelepedia.sequencediagram.operator;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;

import edu.toronto.cs.se.mmint.operator.slice.Slice;
import edu.toronto.cs.se.modelepedia.sequencediagram.SequenceDiagram;
import edu.toronto.cs.se.modelepedia.sequencediagram.Lifeline;
import edu.toronto.cs.se.modelepedia.sequencediagram.Message;
import edu.toronto.cs.se.modelepedia.sequencediagram.Object;

public class SDSlice extends Slice {

	@Override
	// Get all model elements that are potentially impacted by the input set.
	public Set<EObject> getAllImpactedElements(Set<EObject> elemSet) {
		Set<EObject> impactedAll = new HashSet<>();
		Set<EObject> impactedCur = new HashSet<>();
		Set<EObject> impactedNext = new HashSet<>();
		
		// Iterate through the current set of newly added model elements 
		// to identify all others that may be potentially impacted. 
		impactedAll.addAll(elemSet);
		impactedCur.addAll(elemSet);
		while (!impactedCur.isEmpty()) {
			for (EObject elem : impactedCur) {
				// Get all model elements directly impacted by the current 
				// one in consideration and remove duplicates.
				for (EObject newElem : getDirectlyImpactedElements(elem)) {
					if (!impactedAll.contains(newElem)) {
						impactedAll.add(newElem);
						impactedNext.add(newElem);
					}
				}
			}
			
			// Prepare for next iteration.
			impactedCur.clear();
			impactedCur.addAll(impactedNext);
			impactedNext.clear();
		}
		
		return impactedAll;
	}
	
	// Get impacted model elements directly reachable from the input element.
	@Override
	public Set<EObject> getDirectlyImpactedElements(EObject elem) {
		Set<EObject> impacted = new HashSet<>();

		// The input element itself is always impacted.
		impacted.add(elem);

		// If input is a sequence diagram, then the following are impacted:
		// 1) Owned objects and messages.
		if (elem instanceof SequenceDiagram) {
			SequenceDiagram d = (SequenceDiagram) elem;
			impacted.addAll(d.getObjects());
			impacted.addAll(d.getMessages());

		// If input is an object, then the following are impacted:
		// 1) Owned lifelines.
		} else if (elem instanceof Object) {
			Object o = (Object) elem;
			impacted.add(o.getLifeline());

		// If input is a lifeline, then the following are impacted:
		// 1) Messages as source.
		// 2) Messages as target.
		} else if (elem instanceof Lifeline) {
			Lifeline l = (Lifeline) elem;
			impacted.addAll(l.getMessagesAsSource());
			impacted.addAll(l.getMessagesAsTarget());

		// If input is a message, then nothing is impacted.
		} else if (elem instanceof Message) {
			Message m = (Message) elem;
		}

		// Remove possible null element from impacted set.
		impacted.remove(null);
		
		return impacted;
	}	
}

