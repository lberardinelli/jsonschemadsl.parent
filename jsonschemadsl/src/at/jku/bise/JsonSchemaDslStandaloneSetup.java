/*
 * generated by Xtext 2.23.0
 */
package at.jku.bise;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class JsonSchemaDslStandaloneSetup extends JsonSchemaDslStandaloneSetupGenerated {

	public static void doSetup() {
		new JsonSchemaDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}