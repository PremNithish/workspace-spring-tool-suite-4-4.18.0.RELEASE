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
import com.ipl.demo.service.iplteamsService;
@RestController
public class iplteamsController {
	@Autowired
	iplteamsService iplser;
	
	@GetMapping(value="/fetchteams")
	public List<teams> getteams()
	{
		List<teams> teamsList=iplser.getteams();
		return teamsList;
	}
	@PostMapping(value="/postteams")
	public teams saveteam(@RequestBody teams t)
	{
		return iplser.saveteam(t);
	}
	
	@PutMapping(value="/updateteams")
	public teams putteam(@RequestBody teams t)
	{
		return iplser.updateteam(t);
	}
	
	@DeleteMapping(value="/deleteteams/{iplteam}")
	public void deleteStudent(@PathVariable("iplteam") int teamno)
	{
		iplser.deleteteam(teamno);
		
	}
	@GetMapping(value="/get/{number}")
	public teams getteam(@PathVariable("number") int teamno)
	{
		return iplser.getteam(teamno);
	}
}
