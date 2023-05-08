package com.instagram.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.instagram.demo.model.Persons;
import com.instagram.demo.service.PersonsService;

@RestController
public class PersonsController {

	@Autowired
	PersonsService pservice;
	
	
	@GetMapping("/getPersons")
	public List<Persons> findAll()
	{
		return pservice.getPersons();
	}
	
	@PostMapping("/postPersons")
	public Persons addPersons(@RequestBody Persons p)
	{
		return pservice.postPersons(p);
	}
}
