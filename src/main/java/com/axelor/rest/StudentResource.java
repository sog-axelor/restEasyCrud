package com.axelor.rest;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.jboss.resteasy.plugins.providers.html.View;

import com.axelor.db.Student;

@Path("/student")
public class StudentResource {

		@GET			//simple view return
		@Produces("text/html")
		public View getStudents() {
			return new View("index.jsp");
		}

		@GET					//simple class return
		@Path("/test")
		@Produces(MediaType.APPLICATION_JSON)
		public Student testMethod() {
			return new Student("A", "B");
		}
	
	 	@POST  					//simple form value return 
	    @Path("/add")  
	 	@Produces(MediaType.APPLICATION_JSON)
	    public Response addUser(   
	        @FormParam("fname") String fname,  
	        @FormParam("lname") String lname) {  
	 		
	 		Student st = new Student(fname, lname);
	 		
	        return Response.status(200)  
	            .entity(st)  
	            .build();  
	    }  
	
	
	
	
	
}
