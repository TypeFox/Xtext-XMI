/** 
 * Copyright (c) 2017 TypeFox and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package io.typefox.xtextxmi.tree.xtext

import org.eclipse.xtext.resource.generic.AbstractGenericResourceRuntimeModule
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider

class TreeRuntimeModule extends AbstractGenericResourceRuntimeModule {
	
	override protected getFileExtensions() {
		'tree'
	}
	
	override protected getLanguageName() {
		'io.typefox.xtextxmi.tree.Tree'
	}
	
	override bindIQualifiedNameProvider() {
		DefaultDeclarativeQualifiedNameProvider
	}
	
	// bind additional services here
}