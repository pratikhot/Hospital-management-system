package com.ty.hospital_app.dao;

import java.util.List;


import com.ty.hospital_app.dto.User;

public interface UserDao
{
	public User saveUser(User user);
	
	public User getUSerId(int uid);
	
	public boolean deleteUserId(int uid);
	
	public User updateUser(int uid,User user);
	
	public List<User> getAlluser();
	
	public List<User> getuserbyRole(String role);
	
	

}
