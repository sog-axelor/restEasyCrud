package com.axelor.module;

import com.axelor.db.studentService;
import com.axelor.rest.StudentResource;
import com.google.inject.AbstractModule;
import com.unique.impl.studentImpl;

public class AxelorModule extends AbstractModule {
	
	@Override
	protected void configure() {
		bind(StudentResource.class);
		bind(studentService.class).to(studentImpl.class);
	}
}
