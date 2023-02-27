package com.example.demo.service;

import com.example.demo.dto.UserDTO;
import java.util.List;

public interface UserService {

	UserDTO saveUser(UserDTO userDTO);

	List<UserDTO> getAllUsers();
	
	UserDTO updateUser(UserDTO userDTO);

}
