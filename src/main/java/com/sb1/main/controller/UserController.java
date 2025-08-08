package com.sb1.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sb1.main.entity.Users;
import com.sb1.main.service.UserService;

@Controller
@RequestMapping("/project1")
public class UserController 
{
	@Autowired
	public UserService service;
	
	@GetMapping("/home-page")
	public String UserFirstPage(Model model)
	{
		 model.addAttribute("users", service.Select());
		return "user";
	}
	
	@PostMapping("/insert")
	public String InsertUser(Users user)
	{
		service.Insert(user);
		return "redirect:/project1/home-page";
	}
	
	@DeleteMapping("/delete/{userId}")
	public void DeleteUser(@PathVariable Users userId)
	{
		service.Delete(userId);
	}
}