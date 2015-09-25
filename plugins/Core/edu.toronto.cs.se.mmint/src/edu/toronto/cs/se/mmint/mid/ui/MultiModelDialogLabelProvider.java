/**
 * Copyright (c) 2012-2015 Marsha Chechik, Alessio Di Sandro, Michalis Famelis,
 * Rick Salay.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Alessio Di Sandro - Implementation.
 */
package edu.toronto.cs.se.mmint.mid.ui;

import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;

import edu.toronto.cs.se.mmint.mid.ExtendibleElement;
import edu.toronto.cs.se.mmint.mid.MID;
import edu.toronto.cs.se.mmint.mid.relationship.ExtendibleElementReference;

/**
 * The label provider for the repository types tree dialog.
 * 
 * @author Alessio Di Sandro
 * 
 */
public class MultiModelDialogLabelProvider implements ILabelProvider {

	private AdapterFactoryLabelProvider labelProvider;

	public MultiModelDialogLabelProvider() {

		ComposedAdapterFactory adapterFactory = GMFDiagramUtils.getAdapterFactory();
		labelProvider = new AdapterFactoryLabelProvider(adapterFactory);
	}

	/**
	 * {@inheritDoc}
	 * This implementation does nothing.
	 */
	@Override
	public void addListener(ILabelProviderListener listener) {
		// do nothing
	}

	/**
	 * {@inheritDoc}
	 * This implementation does nothing.
	 */
	@Override
	public void dispose() {
		// do nothing
	}

	/**
	 * {@inheritDoc}
	 * This implementation does nothing.
	 */
	@Override
	public boolean isLabelProperty(Object element, String property) {
		return false;
	}

	/**
	 * {@inheritDoc}
	 * This implementation does nothing.
	 */
	@Override
	public void removeListener(ILabelProviderListener listener) {
		// do nothing
	}

	/**
	 * {@inheritDoc}
	 * This implementation does nothing.
	 */
	@Override
	public Image getImage(Object element) {

		return labelProvider.getImage(element);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getText(Object element) {

		if (element instanceof MID) {
			return "Type MID";
		}
		if (element instanceof ExtendibleElement) {
			return ((ExtendibleElement) element).getName();
		}
		if (element instanceof ExtendibleElementReference) {
			return ((ExtendibleElementReference) element).getObject().getName();
		}

		return "";
	}

}
