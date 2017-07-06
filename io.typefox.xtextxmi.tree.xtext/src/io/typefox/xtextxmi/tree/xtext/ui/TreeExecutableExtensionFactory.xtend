/** 
 * Copyright (c) 2017 TypeFox and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package io.typefox.xtextxmi.tree.xtext.ui

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory
import org.osgi.framework.Bundle
import com.google.inject.Injector

/** 
 * Instantiates classes declared in the plugin.xml using the DI container.
 */
class TreeExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {
	
	override protected Bundle getBundle() {
		return Activator.getDefault().getBundle()
	}

	override protected Injector getInjector() {
		return Activator.getDefault().getInjector()
	}
}
