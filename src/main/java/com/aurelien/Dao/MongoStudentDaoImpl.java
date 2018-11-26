package com.aurelien.Dao;

import java.util.ArrayList;
//import java.sql.Connection;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.aurelien.Entity.Student;

@Repository
@Qualifier("mongoData")
public class MongoStudentDaoImpl implements StudentDao
{
//	Connection mongoConnection;

	@Override
	public ArrayList<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return new ArrayList<Student>(){
		{
					add(new Student(1,"Mario","Nothing"));
		}
		};
	}

	@Override
	public Student getStudentById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeStudentById(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertStudentToDB(Student student) {
		// TODO Auto-generated method stub
		
	}
	
	
}
