/*
 * generated by Xtext 2.12.0
 */
package uk.ac.kcl.inf.mazegame


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class MazeGameStandaloneSetup extends MazeGameStandaloneSetupGenerated {

	def static void doSetup() {
		new MazeGameStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
