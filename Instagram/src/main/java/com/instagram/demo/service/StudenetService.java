package com.instagram.demo.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.instagram.demo.dao.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import com.instagram.demo.model.Student;

@Service
public class StudenetService {

	@Autowired
	StudentRepository studRepository;
	
	public List<Student> getAllStudents()
	{
		List<Student>studList= studRepository.findAll();
		return studList;
		
	}

	public Student saveStudent(Student s) {
		Student obj=studRepository.save(s);
		return obj;
	}
	public Student updateStudent(Student s) {
		Student obj=studRepository.save(s);
		return obj;
	}

	public void deleteStudent(int regno) {
		studRepository.deleteById(regno);
	}

	public Student getStudent(int regno) {
		Student obj=studRepository.findById(regno).get();
		return obj;
	}
}
