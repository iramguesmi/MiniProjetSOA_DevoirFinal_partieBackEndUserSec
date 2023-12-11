package com.iram.users.service;

import org.springframework.stereotype.Service;

import com.iram.users.entities.Role;
import com.iram.users.entities.User;

import jakarta.transaction.Transactional;



public interface UserService {
	
	User saveUser(User user);
	User findUserByUsername(String username);
	Role addRole(Role role);
	User addRoleToUser(String username, String rolename);

}
