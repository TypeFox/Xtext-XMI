/*
 * generated by Xtext 2.12.0
 */
package io.typefox.xtextxmi.xtree

import io.typefox.xtextxmi.xtree.resource.XtreeFragmentProvider

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
class XtreeRuntimeModule extends AbstractXtreeRuntimeModule {
	
	override bindIFragmentProvider() {
		XtreeFragmentProvider
	}
	
}
