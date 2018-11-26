package com.aurelien.Dao;

import java.util.Collection;

import com.aurelien.Entity.Student;

public interface StudentDao {

	Collection<Student> getAllStudents();

	Student getStudentById(int id);

	void removeStudentById(int id);

	void updateStudent(Student student);

	void insertStudentToDB(Student student);

}