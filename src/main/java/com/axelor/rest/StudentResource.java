package com.axelor.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.jboss.resteasy.plugins.providers.html.View;

import com.axelor.db.Student;

@Path("/student")
public class StudentResource {

	@GET
	@Produces("text/html")
	public View getStudents() {
		return new View("index.jsp");
	}

	@GET
	@Path("/test")
	@Produces(MediaType.APPLICATION_JSON)
	public Student testMethod() {
		return new Student("A", "B");
	}
}
