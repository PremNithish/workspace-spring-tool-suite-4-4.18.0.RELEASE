package com.instagram.demo.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import com.instagram.demo.model.Persons;
@Repository
public interface PersonRepository extends JpaRepository<Persons,Long>{
	@Query(value="select p from Persons p join p.address a")
	List<Persons>getPersons();
}