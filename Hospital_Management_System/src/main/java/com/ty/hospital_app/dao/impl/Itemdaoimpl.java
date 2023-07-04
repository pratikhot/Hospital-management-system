package com.ty.hospital_app.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.hospital_app.dao.ItemDao;
import com.ty.hospital_app.dto.Branch;
import com.ty.hospital_app.dto.Item;
import com.ty.hospital_app.dto.Medorder;

public class Itemdaoimpl implements ItemDao 
{

	public Item saveItem(int mid, Item item) 
	{

		EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Medorder medorder=entityManager.find(Medorder.class, mid);

		if(medorder!=null)
		{
			entityTransaction.begin();
			entityManager.persist(item);
			entityTransaction.commit();
			return item;
		}
		else
		{
			return null;
		}
		
	}

	public Item getItembyId(int iid) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Item item =entityManager.find(Item.class, iid);
		return item;
	}

	public boolean deleteItembyid(int iid) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Item item =entityManager.find(Item.class, iid);

		if(item!=null)
		{
			entityTransaction.begin();
			entityManager.remove(item);
			entityTransaction.commit();
			return true;
		}
		else
		{
			return false;
		}
	}

	public Item updateItem(int iid, Item item) {

		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Item item1 =entityManager.find(Item.class, iid);
		if(item1!=null)
		{
			item1.setIname(item.getIname());
			item1.setCost(item.getCost());
			entityTransaction.begin();
			entityManager.merge(item1);
			entityTransaction.commit();
			return item1;
		}
		else
		{
			return null;
		}

	
	}

	public List<Item> getAllItem() {

		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Query query=entityManager.createQuery("select s from Item s");
		List<Item> item=query.getResultList();
		return item;

	}

}
