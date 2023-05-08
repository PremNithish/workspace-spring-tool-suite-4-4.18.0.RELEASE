package com.instagram.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.instagram.demo.dao.PersonRepository;
import com.instagram.demo.model.Persons;
@Service
public class PersonsService {

	@Autowired
	PersonRepository prepo;
	
	public List<Persons> getPersons()
	{
		return prepo.findAll();
	}
	public Persons postPersons(Persons p)
	{
		return prepo.save(p);
	}	
}