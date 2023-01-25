package com.axelor.db;

public interface studentService {
	void addStudent(String fname,String lname);
	void updateStudent(int id,String fname,String lname);
	void viewStudent(int id,String fname,String lname);
	void deleteStudent(int id);
}
