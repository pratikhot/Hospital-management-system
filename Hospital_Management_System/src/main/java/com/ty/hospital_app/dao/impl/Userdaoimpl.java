package com.ty.hospital_app.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.hospital_app.dao.UserDao;
import com.ty.hospital_app.dto.Person;
import com.ty.hospital_app.dto.User;

public class Userdaoimpl  implements UserDao{

	public User saveUser(User user) 
	{
		EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
	 	entityTransaction.begin();
	 	entityManager.persist(user);
	 	entityTransaction.commit();
	 	
	 	return user;
	}

	public User getUSerId(int uid) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		User user=entityManager.find(User.class, uid);
		return user;
	}

	public boolean deleteUserId(int uid) {
		EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		User user = entityManager.find(User.class ,uid);
		if(user!=null)
		{
			entityTransaction.begin();
			entityManager.remove(user);
			entityTransaction.commit();
			return true;
		}
		else
		{
			return false;
		}
	}

	public User updateUser(int uid, User user) {

		EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		User user1 = entityManager.find(User.class ,uid);
		if(user1!=null)
		{
			user1.setUname(user.getUname());
			user1.setRole(user.getRole());
			entityTransaction.begin();
			entityManager.merge(user1);
			entityTransaction.commit();
			return user1;
	    }
		else
		{
			return null;
		}

	}

	public List<User> getAlluser() {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Query query=entityManager.createQuery("select s User Person s");
		List<User> user=query.getResultList();
		return user;
	}

	public List<User> getuserbyRole(String role) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Query query=entityManager.createQuery("select s User Person s where role=?");
		List<User> user=query.getResultList();
		return user;
	}

}
