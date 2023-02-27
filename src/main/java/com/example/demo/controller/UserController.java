package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.UserDTO;
import com.example.demo.service.UserService;

@RestController
@RequestMapping(value = "api/v/user")
public class UserController {
	
	@Autowired
	private UserService userService;

	@GetMapping("/getUser")
	public List<UserDTO> getUser() {
		return userService.getAllUsers();
	}
	
	@PostMapping("/saveUser")
	public UserDTO saveUser(@RequestBody UserDTO userDTO) {
		return userService.saveUser(userDTO);
	}
	
	@PutMapping("/updateUser")
	public UserDTO updateUser(@RequestBody UserDTO userDTO) {
		return userService.saveUser(userDTO);
	}
	
	@DeleteMapping("/deleteUser")
	public String deleteUser(@RequestParam Integer id) {
		return userService.deleteUser(id);
	}
}
