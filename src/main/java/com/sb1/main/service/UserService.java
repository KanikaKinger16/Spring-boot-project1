package com.sb1.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.sb1.main.entity.Users;
import com.sb1.main.repo.UserRepo;

@Configuration
public class UserService {
	
	@Autowired
	public UserRepo repo;
	
	//Insert
	public void Insert(Users user)
	{
		repo.save(user);
	}
	
	//Delete
	public void Delete(Users userId)
	{
		repo.delete(userId);
	}
	
	//Select
	public List<Users> Select()
	{
		return repo.findAll();
	}
}