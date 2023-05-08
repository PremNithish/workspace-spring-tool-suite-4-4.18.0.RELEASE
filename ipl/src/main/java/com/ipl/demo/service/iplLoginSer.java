package com.ipl.demo.service;
import com.ipl.demo.model.*;
import com.ipl.demo.repository.iplLoginrepo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class iplLoginSer {

@Autowired
private iplLoginrepo lrepo;
public String checkLogin(String username,String psword)
{
	iplLoginDemo user= lrepo.findByUsername(username);
	if(user==null)
	{
		return "No user found";
	}
	else
	{
		if(user.getPassword().equals(psword))
		{
			return "Login Succesfull";
		}
		else
		{
			return "Login Failed";
		}
	}
} 
public iplLoginDemo addUser(iplLoginDemo cl)
{
	return lrepo.save(cl);
}
public List<iplLoginDemo> getUser()
{
	return lrepo.findAll();
}
public iplLoginDemo putUser(iplLoginDemo cl)
{
	return lrepo.save(cl);
}
}
