/*
 * generated by Xtext 2.12.0
 */
package uk.ac.kcl.inf.mazegame.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import uk.ac.kcl.inf.mazegame.xtext.ui.internal.XtextActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class MazeGameExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return XtextActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return XtextActivator.getInstance().getInjector(XtextActivator.UK_AC_KCL_INF_MAZEGAME_MAZEGAME);
	}
	
}