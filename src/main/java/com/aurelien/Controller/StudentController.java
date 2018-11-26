package com.aurelien.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ErrorAttributes;
import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collection;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.aurelien.Entity.Student;
import com.aurelien.Service.StudentService;

@RestController
@RequestMapping("/Students")
public class StudentController 
{
	@Autowired
	private StudentService studentService;
	
	@RequestMapping(method = RequestMethod.GET)
	public Collection<Student> getAllStudents()
	{
		return studentService.getAllStudents();
	}
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public Student getStudentById(@PathVariable("id") int id) {
		return studentService.getStudentById(id);
	}
	@RequestMapping(value="/{id}",method=RequestMethod.DELETE)
	public void deleteStudentById(@PathVariable("id") int id) 
	{
		studentService.removeStudentById(id);
	}
	@RequestMapping(method = RequestMethod.PUT,consumes = MediaType.APPLICATION_JSON_VALUE)
	public void deleteStudentById(@RequestBody Student student)
	{
		studentService.updateStudent(student);
	}
	@RequestMapping(method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)
	public void insertStudent(@RequestBody Student student)
	{
		studentService.insertStudent(student);
	}
}	

