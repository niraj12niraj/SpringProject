package com.my.spring.dao;

import java.util.List;

import com.my.spring.entity.User;
import com.my.spring.repository.UserRepository;

public interface UserDAO{
	
	public List<User> getList();
	//public void dummyUserList();
	public void saveUser(User user);
	public User getUserById(Long id);
	public void editOrUpdate(User user);
	public User getUserByName(String name);
	public User getUserByMobileNumber(Long mobile);
	public User getUserByEmail(String email);

}
