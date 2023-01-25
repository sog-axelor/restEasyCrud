package com.axelor.module;

import com.axelor.db.StudentService;
import com.axelor.rest.StudentResource;
import com.google.inject.AbstractModule;
import com.unique.impl.StudentServiceImpl;

public class AxelorModule extends AbstractModule {
	
	@Override
	protected void configure() {
		bind(StudentResource.class);
		bind(StudentService.class).to(StudentServiceImpl.class);
	}
}
