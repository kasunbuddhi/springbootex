package com.example.demo.service;

import com.example.demo.dto.UserDTO;
import com.example.demo.entity.User;

import java.util.List;

import org.springframework.data.repository.query.Param;

public interface UserService {

	UserDTO saveUser(UserDTO userDTO);

	List<UserDTO> getAllUsers();
	
	UserDTO updateUser(UserDTO userDTO);

	String deleteUser(Integer id);
	
	UserDTO getUserById(Integer Id);
	
	UserDTO getUserByNameAddress(String name, String address);

}
