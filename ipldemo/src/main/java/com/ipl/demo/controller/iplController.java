package com.ipl.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ipl.demo.model.teams;
import com.ipl.demo.service.iplService;

@RestController
public class iplController {

	@Autowired
	iplService iplser;
	
	@GetMapping(value="/fetch")
	public List<teams> getteams()
	{
		List<teams> teamsList=iplser.getteams();
		return teamsList;
	}
	@PostMapping(value="/post")
	public teams saveteam(@RequestBody teams t)
	{
		return iplser.saveteam(t);
	}
	
	@PutMapping(value="/post")
	public teams putteam(@RequestBody teams t)
	{
		return iplser.updateteam(t);
	}
	
	@DeleteMapping(value="/delete/{iplteam}")
	public void deleteStudent(@PathVariable("iplteam") int teamno)
	{
		iplser.deleteteam(teamno);
		
	}
	
}
