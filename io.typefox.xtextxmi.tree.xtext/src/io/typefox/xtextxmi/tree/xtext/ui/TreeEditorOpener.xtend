/** 
 * Copyright (c) 2017 TypeFox and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package io.typefox.xtextxmi.tree.xtext.ui

import io.typefox.xtextxmi.tree.presentation.TreeEditor
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EReference
import org.eclipse.ui.IEditorPart
import org.eclipse.xtext.ui.editor.LanguageSpecificURIEditorOpener

class TreeEditorOpener extends LanguageSpecificURIEditorOpener {
	
	override protected void selectAndReveal(
		IEditorPart openEditor, 
		URI uri, EReference crossReference, int indexInList, 
		boolean select) {
		if (uri.fragment !== null) {
			val ecoreEditor = openEditor.getAdapter(TreeEditor)
			if (ecoreEditor instanceof TreeEditor) {
				val eObject = ecoreEditor.editingDomain.resourceSet.getEObject(uri, true)
				ecoreEditor.setSelectionToViewer(#[eObject])
			}
		}
	}

	override protected String getEditorId() {
		return "io.typefox.xtextxmi.tree.presentation.TreeEditorID"
	}
}
