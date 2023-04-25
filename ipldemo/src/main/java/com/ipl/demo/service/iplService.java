package com.ipl.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ipl.demo.model.teams;
import com.ipl.demo.repository.iplRepository;

import java.util.List;

@Service
public class iplService {
	
	
	@Autowired
	iplRepository repo;

	
	public List<teams> getteams()
	{
		List<teams> teamsList=repo.findAll();
		return teamsList;
	}
	
	public teams saveteam(teams t) {
		
		teams obj=repo.save(t);
		return obj;
	}
	
	public teams updateteam(teams t) {
		
		teams obj=repo.save(t);
		return obj;
	}

	public void deleteteam(int teamno) {
		repo.deleteById(teamno);;
		
	}
}
