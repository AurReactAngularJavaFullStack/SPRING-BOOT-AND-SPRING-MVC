package com.aurelien.Service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.aurelien.Dao.StudentDao;
import com.aurelien.Entity.Student;

@Service
public class StudentService 
{
	@Autowired
	@Qualifier("mongoData")
	private StudentDao studentDao;
	
	public Collection<Student> getAllStudents()
	{
		return this.studentDao.getAllStudents();
	}
	public Student getStudentById(int id)
	{
		return this.studentDao.getStudentById(id);
	}
	public void removeStudentById(int id)
	{
		// TODO Auto-generated method stub
		this.studentDao.removeStudentById(id);
		
	}
	public void updateStudent(Student student)
	{
		this.studentDao.updateStudent(student);
	}
	public void insertStudent(Student student) 
	{
		// TODO Auto-generated method stub
		this.studentDao.insertStudentToDB(student);
	}
}
