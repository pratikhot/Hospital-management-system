package com.ty.hospital_app.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.hospital_app.dao.MedorderDao;
import com.ty.hospital_app.dto.Branch;
import com.ty.hospital_app.dto.Encounter;

import com.ty.hospital_app.dto.Medorder;

public class Medorderdaoimpl implements MedorderDao {

	public Medorder saveMedorder(int eid, Medorder medorder) {
		EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Encounter encounter=entityManager.find(Encounter.class, eid);

		if(encounter!=null)
		{
			entityTransaction.begin();
			entityManager.persist(medorder);
			entityTransaction.commit();
			return medorder;
		}
		else
		{
			return null;
		}

	}

	public Medorder getMedorderbyId(int mid) {

		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Medorder medorder =entityManager.find(Medorder.class, mid);
		return medorder;
	
	}

	public boolean deleteMedorderbyId(int mid) {

		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Medorder medorder =entityManager.find(Medorder.class, mid);

		if(medorder!=null)
		{
			entityTransaction.begin();
			entityManager.remove(medorder);
			entityTransaction.commit();
			return true;
		}
		else
		{
			return false;
		}
	
	
	}

	public Medorder updateMedorder(int mid, Medorder medorder) {

		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Medorder medorder1 =entityManager.find(Medorder.class, mid);
		if(medorder1!=null)
		{
			medorder1.setDname(medorder.getDname());
			medorder1.setOrderdate(medorder.getOrderdate());
			
			entityTransaction.begin();
			entityManager.merge(medorder1);
			entityTransaction.commit();
			return medorder1;
		}
		else
		{
			return null;
		}

	
	}

	public List<Medorder> getAllmedorder() {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Query query=entityManager.createQuery("select s from Medorder s");
		List<Medorder> medorder=query.getResultList();
		return medorder;
	}

	public List<Medorder> getmedorderbyDocotorName(String name) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Query query=entityManager.createQuery("select s from Medorder s where name=?");
		List<Medorder> medorder=query.getResultList();
		return medorder;
	}

	public List<Medorder> getmedorderbyDate(String date) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Query query=entityManager.createQuery("select s from Medorder s where date=?");
		List<Medorder> medorder=query.getResultList();
		return medorder;
	}

}
