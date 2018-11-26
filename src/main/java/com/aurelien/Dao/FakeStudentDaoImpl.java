package com.aurelien.Dao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.aurelien.Entity.Student;

@Repository
@Qualifier("fakeData")
public class FakeStudentDaoImpl implements StudentDao
{
	private static Map<Integer, Student> students;
	
	static 
	{
		students = new HashMap<Integer, Student>()
		{
			{
				put(1, new Student(1,"Aurelien","Computer Science"));
				put(2, new Student(1,"Daniel","Finance"));
				put(1, new Student(1,"Aurelian","Maths"));
			}
		};
	}	
	/* (non-Javadoc)
	 * @see com.aurelien.Dao.StudentDao#getAllStudents()
	 */
	@Override
	public Collection<Student> getAllStudents()
	{
		return this.students.values();
	}
	/* (non-Javadoc)
	 * @see com.aurelien.Dao.StudentDao#getStudentById(int)
	 */
	@Override
	public Student getStudentById(int id)
	{
		return this.students.get(id);
	}
	/* (non-Javadoc)
	 * @see com.aurelien.Dao.StudentDao#removeStudentById(int)
	 */
	@Override
	public void removeStudentById(int id) 
	{
		// TODO Auto-generated method stub
		this.students.remove(id);
	}
	/* (non-Javadoc)
	 * @see com.aurelien.Dao.StudentDao#updateStudent(com.aurelien.Entity.Student)
	 */
	@Override
	public void updateStudent(Student student)
	{
		Student s = students.get(student.getId());
		s.setCourse(student.getCourse());
		s.setName(student.getName());
		students.put(student.getId(), student);
	}
	/* (non-Javadoc)
	 * @see com.aurelien.Dao.StudentDao#insertStudentToDB(com.aurelien.Entity.Student)
	 */
	@Override
	public void insertStudentToDB(Student student)
{
		// TODO Auto-generated method stub
		this.students.put(student.getId(), student);
	}

}
