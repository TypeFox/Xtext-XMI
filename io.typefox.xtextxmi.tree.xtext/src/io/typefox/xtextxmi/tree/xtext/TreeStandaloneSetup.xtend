/** 
 * Copyright (c) 2017 TypeFox and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package io.typefox.xtextxmi.tree.xtext

import com.google.inject.Guice
import com.google.inject.Inject
import org.eclipse.xtext.ISetup
import org.eclipse.xtext.resource.FileExtensionProvider
import org.eclipse.xtext.resource.IResourceServiceProvider
import io.typefox.xtextxmi.tree.TreePackage

class TreeStandaloneSetup implements ISetup {
	
	@Inject
	private FileExtensionProvider fileExtensionProvider;

	@Inject
	private IResourceServiceProvider resourceServiceProvider;

	@Inject
	private IResourceServiceProvider.Registry registry;
	
	override createInjectorAndDoEMFRegistration() {
		val injector = Guice.createInjector(new TreeRuntimeModule)
		injector.injectMembers(this)
		for(fileExt: fileExtensionProvider.fileExtensions) 
			registry.extensionToFactoryMap.put(fileExt, resourceServiceProvider)

		// the following implicitly registers the EPackage to the registry
		val treePackage = TreePackage.eINSTANCE
		
		return injector
	}
	
}