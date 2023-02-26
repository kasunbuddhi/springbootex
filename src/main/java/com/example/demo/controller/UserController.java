package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.UserDTO;
import com.example.demo.service.UserService;

@RestController
@RequestMapping(value = "api/v/user")
public class UserController {
	
	@Autowired
	private UserService userService;

	@GetMapping("/getUser")
	public String getUser() {
		return "simple-user";
	}
	
	@PostMapping("/saveUser")
	public String saveUser(@RequestBody UserDTO userDTO) {
		return userService.saveUser(userDTO).toString();
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
