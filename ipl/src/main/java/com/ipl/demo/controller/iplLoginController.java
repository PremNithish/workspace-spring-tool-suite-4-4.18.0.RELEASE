package com.ipl.demo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ipl.demo.model.iplLoginDemo;
import com.ipl.demo.model.teams;
import com.ipl.demo.service.iplLoginSer;
@RestController
@RequestMapping("/user")
public class iplLoginController {
	
	@Autowired
	private iplLoginSer lser;
	
	@PostMapping("/log")
	public String login(@RequestBody Map<String,String>loginData)
	{
		String username=loginData.get("username");
		String password=loginData.get("password");
		String result=lser.checkLogin(username,password);
		return result;
	}
	@PutMapping("/put")
	public iplLoginDemo putUser(@RequestBody iplLoginDemo cl)
	{
		return lser.putUser(cl);
	}
	@PostMapping("/adduser")
	public iplLoginDemo AddUser(@RequestBody iplLoginDemo cl)
	{
		return lser.addUser(cl);
	}
	
	@GetMapping("/showall")
	public List<iplLoginDemo> listAll()
	{
		return lser.getUser();
	}
	
}
