package com.axelor.module;

import com.axelor.rest.StudentResource;
import com.google.inject.AbstractModule;

public class AxelorModule extends AbstractModule {
	
	@Override
	protected void configure() {
		bind(StudentResource.class);
	}
}
