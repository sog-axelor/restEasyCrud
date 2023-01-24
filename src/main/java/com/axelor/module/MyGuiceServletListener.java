package com.axelor.module;

import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletContext;

import org.jboss.resteasy.plugins.guice.GuiceResteasyBootstrapServletContextListener;

import com.google.inject.Module;

public class MyGuiceServletListener extends GuiceResteasyBootstrapServletContextListener {

	@Override
	protected List<? extends Module> getModules(ServletContext context) {
		return Arrays.asList(new AxelorModule());
	}
}
