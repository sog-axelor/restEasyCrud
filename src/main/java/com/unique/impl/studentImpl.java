package com.unique.impl;

import javax.persistence.EntityManager;

import com.axelor.db.Student;
import com.axelor.db.studentService;
import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.persist.Transactional;

public class studentImpl implements studentService{

	@Inject
	private Provider<EntityManager> emp;
	
	@Transactional
	@Override
	public void addStudent(String fname, String lname) {
		
//		EntityManager em = emp.get();
//		Student st = new Student();
//		st.setFname(fname);
//		st.setLname(lname);
//		em.persist(st);
//		
		
		Student st = new Student();
		st.setFname(fname);
		st.setLname(lname);
		System.out.println("Is tansition is valid : " + emp.get().getTransaction().isActive());
		emp.get().persist(st);
		System.out.println("Your First name is  : " + st.getFname() +" Last name is : "+ st.getLname());
		
	}

	@Override
	public void updateStudent(int id, String fname, String lname) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void viewStudent(int id, String fname, String lname) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		
	}

}
