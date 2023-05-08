package com.instagram.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import com.instagram.demo.dao.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import com.instagram.demo.model.Student;

import jakarta.transaction.Transactional;


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
	public  Student updateStudent(Student s,int rno) {
		Optional<Student> optional=studRepository.findById(rno);
		Student obj=null;
		if(optional.isPresent())
		{
			obj=optional.get();
			obj.setRegno(s.getRegno());
			obj.setName(s.getName());
			obj.setDepartment(s.getDepartment());
			obj.setEmail(s.getEmail());
		studRepository.saveAndFlush(s);
		}
		return obj;
	
		
	}

	public void deleteStudent(int regno) {
		studRepository.deleteById(regno);
	}

	public Student getStudent(int regno) {
		Student obj=studRepository.findById(regno).get();
		return obj;
	}

	public List<Student> sortStudents(String field) {
		//return studRepository.findAll(Sort.by(field));
		return studRepository.findAll(Sort.by(Direction.DESC, field));
	}
	public Page<Student> pagingStudents(int offset,int pageSize)
	{
		Pageable paging=PageRequest.of(offset, pageSize);
		Page<Student> studData=studRepository.findAll(paging);
		//List<Student> studList=studData.getContent();
		return studData;
	}
	public List<Student> pagingAndSortingEmployees(int offset,int pageSize,String field)
	{
		Pageable paging = PageRequest.of(offset, pageSize).withSort(Sort.by(field));
		Page<Student> stud=studRepository.findAll(paging);
		return stud.getContent();
	}
	public List<Student> fetchStudentsByNamePrefix(String prefix)
	{
		return studRepository.findByNameStartingWith(prefix);
	}
	public List<Student> fetchStudentsByNameSuffix(String suffix)
	{
		return studRepository.findByNameEndingWith(suffix);
	}
	public List<Student> getStudentsByDepartment(String dept,String name)
	{
		return studRepository.getStudentsByDepartment(dept,name);
	}
	@Transactional
	public int deleteStudentByName(String name)
	{
		return studRepository.deleteStudentByName(name);
	}
	@Transactional
	public int updateStudentByName(String department,String name)
	{
		return studRepository.updateStudentByName(department,name);
	}
	
	@Transactional
	public List<Student> fetchStudentByMail(String  email)
	{
		return studRepository.fetchStudentByMail(email);
	}

}
