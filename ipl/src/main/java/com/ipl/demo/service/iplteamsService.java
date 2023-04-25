package com.ipl.demo.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ipl.demo.model.teams;
import com.ipl.demo.repository.iplteamsRepo;

import java.util.List;

@Service
public class iplteamsService {

	@Autowired
	iplteamsRepo repo;

	
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

	public teams getteam(int teamno) {
		teams obj=repo.findById(teamno).get();
		return obj;
	}
}
