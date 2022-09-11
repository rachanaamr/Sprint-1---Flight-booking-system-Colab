package com.capg.service;

import java.util.List;

import com.capg.entities.User;

public interface IUserService {
	public List<User> getUsers();
	
	public User getUser(long userId);
	
	public User addUser(User user);
	
	public User updateUser(User user);
	
	public void deleteUser(long userId);
}
