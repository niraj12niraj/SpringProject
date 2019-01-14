package com.my.spring.service;

import java.io.IOException;
import java.util.List;

import com.my.spring.entity.User;

public interface UserService {
	public List<User> getList();
	//public void dummyUserList();
	public void saveUser(User user) throws IOException, Exception;
	public User getUserById(Long id);
	public void editOrUpdate(User user);
	public User getUserByName(String name);
	public User getUserByMobileNumber(Long mobile);
	public User getUserByEmail(String email);

}
