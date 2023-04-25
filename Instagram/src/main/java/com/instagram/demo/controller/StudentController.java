package com.instagram.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.instagram.demo.model.Student;
import com.instagram.demo.service.StudenetService;

@RestController
public class StudentController {

	@Autowired
	StudenetService studService;
	@GetMapping(value="/fetchStudents")
	public List<Student> getAllStudent()
	{
		List<Student> studList=studService.getAllStudents();
		return studList;
	}
	@PostMapping(value="/saveStudent")
	public Student saveStudent(@RequestBody Student s)
	{
		return studService.saveStudent(s);
		
	}
	@PutMapping(value="/updateStudent")
	public Student updateStudent(@RequestBody Student s)
	{
		return studService.updateStudent(s);
		
	}
	@DeleteMapping(value="/deleteStudent/{regno}")
	public void deleteStudent(@PathVariable("regno") int regno)
	{
		studService.deleteStudent(regno);
		
	}
	@GetMapping(value="/getStudent/{rno}")
	public Student getStudent(@PathVariable("rno")  int regno)
	{
		return studService.getStudent(regno);
	}
}