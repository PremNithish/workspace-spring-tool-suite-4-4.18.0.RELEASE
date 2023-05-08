package com.instagram.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
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
	@PutMapping(value="/updateStudent/{rno}")
	public Student updateStudent(@RequestBody Student s,@PathVariable int rno)
	{
		return studService.updateStudent(s,rno);
		
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
	@GetMapping("/sortStudents/{field}")
	public List<Student> sortStudents(@PathVariable("field") String field)
	{
		return studService.sortStudents(field);
	}
	@GetMapping("/pagingStudents/{offset}/{pageSet}")
	public Page<Student> pagingStudents(@PathVariable("offset") int offset,@PathVariable("pageSet") int pageSize)
	{
		return studService.pagingStudents(offset, pageSize);
	}
	@GetMapping("/pagingwithSortingStudents/{offset}/{pageSet}/{field}")
	public List<Student> pagingStudents(@PathVariable("offset") int offset,@PathVariable("pageSet") int pageSize,@PathVariable("field") String field)
	{
		return studService.pagingAndSortingEmployees(offset, pageSize, field);
	}
	@GetMapping("/fetchStudentsByNamePrefix")
	public List<Student> fetchStudentsByNamePrefix(@RequestParam  String prefix)
	{
		return studService.fetchStudentsByNamePrefix(prefix);
	}
	@GetMapping("/fetchStudentsByNameSuffix")
	public List<Student> fetchStudentsByNameSuffix(@RequestParam  String suffix)
	{
		return studService.fetchStudentsByNameSuffix(suffix);
	}
	@GetMapping("/fetchStudentsByDepartment/{dept}/{name}")
	public List<Student> fetchStudentsByDepartment(@PathVariable String dept,@PathVariable String name)
	{
		return studService.getStudentsByDepartment(dept,name);
	}
	@DeleteMapping("/deletebyquery/{name}")
	public String deleteStudentByName(@PathVariable("name") String name)
	{
		int result=studService.deleteStudentByName(name);
		if(result>0)
			return "Student record deleted";
		else
			return "error while deleting";
	}
	@PutMapping("/updatebyquery/{department}/{name}")
	public String updateStudentByName(@PathVariable("department") String department,@PathVariable("name") String name)
	{
		
		int result=studService.updateStudentByName(department, name);
		if(result>0)
			return "updated";
		else
			return "dept not updated";
	}
	
	@GetMapping("/fetchbymail/{email}")
	public List<Student> fetchStudentByMail(@PathVariable String  email)
	{
		return studService.fetchStudentByMail(email);
	}
	
}