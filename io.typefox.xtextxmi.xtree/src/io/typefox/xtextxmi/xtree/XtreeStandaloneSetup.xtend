/*
 * generated by Xtext 2.12.0
 */
package io.typefox.xtextxmi.xtree


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class XtreeStandaloneSetup extends XtreeStandaloneSetupGenerated {

	def static void doSetup() {
		new XtreeStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
