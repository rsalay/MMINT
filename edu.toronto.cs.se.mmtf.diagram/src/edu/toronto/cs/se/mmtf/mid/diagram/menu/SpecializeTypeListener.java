/*
 * Copyright (c) 2012 Marsha Chechik, Alessio Di Sandro, Michalis Famelis,
 * Rick Salay, Vivien Suen.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Alessio Di Sandro - Implementation.
 */
package edu.toronto.cs.se.mmtf.mid.diagram.menu;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.OperationHistoryFactory;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.ui.PlatformUI;

import edu.toronto.cs.se.mmtf.MMTFException;
import edu.toronto.cs.se.mmtf.MMTFException.Type;
import edu.toronto.cs.se.mmtf.mid.Model;

public class SpecializeTypeListener extends SelectionAdapter {

	Model model;
	Model newMetatype;

	public SpecializeTypeListener(Model model, Model newMetatype) {

		this.model = model;
		this.newMetatype = newMetatype;
	}

	@Override
	public void widgetSelected(SelectionEvent e) {

		List<IFile> files = new ArrayList<IFile>();
		files.add((IFile) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor().getEditorInput().getAdapter(IFile.class));
		//TODO MMTF: need domain file too?
		AbstractTransactionalCommand operatorCommand = new SpecializeTypeCommand(
			TransactionUtil.getEditingDomain(model),
			"Specialize type",
			files
		);
		try {
			OperationHistoryFactory.getOperationHistory().execute(operatorCommand, null, null);
		}
		catch (ExecutionException ex) {
			MMTFException.print(Type.WARNING, "Specialization of " + model.getName() + " into type " + newMetatype.getName() + " history execution error", ex);
		}
	}

	protected class SpecializeTypeCommand extends AbstractTransactionalCommand {

		public SpecializeTypeCommand(TransactionalEditingDomain domain, String label, List<IFile> affectedFiles) {

			super(domain, label, affectedFiles);
		}

		@Override
		protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {

			model.setMetatypeUri(newMetatype.getUri());
			//TODO MMTF: trigger notification of type change

			return CommandResult.newOKCommandResult();
		}

	}

}