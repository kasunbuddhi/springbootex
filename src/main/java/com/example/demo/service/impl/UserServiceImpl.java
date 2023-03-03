package com.example.demo.service.impl;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dto.UserDTO;
import com.example.demo.entity.User;
import com.example.demo.repo.UserRepo;
import com.example.demo.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepo userRepo;
	@Autowired
	private ModelMapper modelMapper;
	
	@Override
	public UserDTO saveUser(UserDTO userDTO) {
		User user = userRepo.save(modelMapper.map(userDTO, User.class));
		return modelMapper.map(user, UserDTO.class);
	}
	
	@Override
	public List<UserDTO> getAllUsers() {
		List<User> userList = userRepo.findAll();
		List<UserDTO> entityToDto = modelMapper.map(userList, new TypeToken<List<UserDTO>>() {
		}.getType());
		return entityToDto;
	}
	
	@Override
	public UserDTO updateUser(UserDTO userDTO) {
		User user = userRepo.save(modelMapper.map(userDTO, User.class));
		return modelMapper.map(user, UserDTO.class);
	}
	
	@Override
	public String deleteUser(Integer id) {
		userRepo.deleteById(id);
		return "deleted : " + id;
	}
	
	@Override
	public UserDTO getUserById(Integer Id) {
		User user = userRepo.getUserById(Id);
		UserDTO userDto = modelMapper.map(user, UserDTO.class);
		return userDto;
	}

	@Override
	public UserDTO getUserByNameAddress(String name, String address) {
		User user = userRepo.getUserByNameAddress(name, address);
		UserDTO userDto = modelMapper.map(user, UserDTO.class);
		return userDto;
	}
	
	
}
