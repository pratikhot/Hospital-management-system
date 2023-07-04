package com.ty.hospital_app.service;

import java.util.List;
import com.ty.hospital_app.dao.impl.Userdaoimpl;
import com.ty.hospital_app.dto.User;

public class UserService
{
	public void saveUser(User user)
	{
		Userdaoimpl daoImp =new  Userdaoimpl();
		User user1 = daoImp.saveUser(user);
		if(user1!=null)
		{
			System.out.println("Data Saved");
		}
		else
		{
			System.out.println("Unfortunately Data Not Saved");
		}
	}

	public  User getuserbyId(int uid)
	{
		Userdaoimpl daoImp =new  Userdaoimpl();
		User user1 = daoImp.getUSerId(uid);
		if(user1!=null)
		{
			return user1;
		}
		else
		{
			return null;
		}
	}
	public void deleteUserbyId(int uid)
	{
		Userdaoimpl daoImp =new  Userdaoimpl();
		boolean flag = daoImp.deleteUserId(uid);
		if(flag)
		{
			System.out.println("data deleted");
		}
		else
		{
			System.out.println("data not found");
		}
	}
	public User updateUserbyid(int uid, User user)
	{
		Userdaoimpl daoImp =new  Userdaoimpl();
		User user1= daoImp.updateUser(uid, user);
		if(user1!=null)
		{
			return user1;
		}
		else
		{
			return null;
		}
		
	}
	public List<User> getAllUser()
	{
		Userdaoimpl daoImp =new  Userdaoimpl();
		List<User> list=daoImp.getAlluser();
			if(list!=null)
			{
			
			return list;
		}
		else
		{
			return null;
		}
		
	}
	public List<User> getuserbyRole(String role)
	{
		Userdaoimpl daoImp =new  Userdaoimpl();
		List<User> list=daoImp.getuserbyRole(role);
			if(list!=null)
			{
			
			return list;
		}
		else
		{
			return null;
		}
		
	}

}
