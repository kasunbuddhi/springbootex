package com.example.demo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/v/user")
public class UserController {

	@GetMapping("/getUser")
	public String getUser() {
		return "simple-user";
	}
	
	@PostMapping("/saveUser")
	public String saveUser() {
		return "simple-user-save";
	}
	
	@PutMapping("/updateUser")
	public String updateUser() {
		return "simple-user-update";
	}
	
	@DeleteMapping("/deleteUser")
	public String deleteUser() {
		return "simple-user-delete";
	}
}
