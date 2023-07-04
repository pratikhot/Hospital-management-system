package com.ty.hospital_app.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.hospital_app.dao.PersonDao;
import com.ty.hospital_app.dto.Branch;
import com.ty.hospital_app.dto.Encounter;

import com.ty.hospital_app.dto.Person;

public class Persondaoimpl implements PersonDao
{

	public Person savePerson(int eid, Person person) {
		EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Encounter encounter=entityManager.find(Encounter.class, eid);

		if(encounter!=null)
		{
			entityTransaction.begin();
			entityManager.persist(person);
			entityTransaction.commit();
			return person;
		}
		else
		{
			return null;
		}

	}

	public Person getPersonbyId(int pid) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Person person =entityManager.find(Person.class, pid);
		return person;
	}

	public boolean deletePersonbyid(int pid) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Person person =entityManager.find(Person.class, pid);

		if(person!=null)
		{
			entityTransaction.begin();
			entityManager.remove(person);
			entityTransaction.commit();
			return true;
		}
		else
		{
			return false;
		}
	}

	public Person updatePerson(int pid, Person person) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Person person1 =entityManager.find(Person.class, pid);

		if(person1!=null)
		{
			person1.setPname(person.getPname());
			person1.setAddress(person.getAddress());
			entityTransaction.begin();
			entityManager.merge(person1);
			entityTransaction.commit();
			return person1;
		}
		else
		{
			return null;
		}

	
		
	}

	public List<Person> getAllPerson() {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Query query=entityManager.createQuery("select s from Person s");
		List<Person> person=query.getResultList();
		return person;

	}

	public List<Person> getPersonbyGender(String gender) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Query query=entityManager.createQuery("select s from Person s where gender=?");
		List<Person> person=query.getResultList();
		return person;
		
	}

	public List<Person> getPersonbyAge(int age) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Query query=entityManager.createQuery("select s from Person s where age=?");
		List<Person> person=query.getResultList();
		return person;
	}

	public List<Person> getPersonbyPhone(long phno) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Query query=entityManager.createQuery("select s from Person s where phno=?");
		List<Person> person=query.getResultList();
		return person;
	}

}
