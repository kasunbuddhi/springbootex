package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.User;

public interface UserRepo extends JpaRepository<User, Integer>{

	@Query(value = "select * from User u where u.id = :userId", 
			  nativeQuery = true)
	public User getUserById(@Param("userId")Integer userId);
	
	@Query(value = "select * from User u where u.name = :name and address = :address", 
			  nativeQuery = true)
	public User getUserByNameAddress(@Param("name")String name, @Param("address")String address);
}
