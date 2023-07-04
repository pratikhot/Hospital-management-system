package com.ty.hospital_app.service;
import java.util.List;
import com.ty.hospital_app.dao.impl.Persondaoimpl;
import com.ty.hospital_app.dto.Person;

public class PersonService
{
	public void savePerson(int eid, Person person)
	{
		   Persondaoimpl daoImp =new Persondaoimpl();
		   Person person1 = daoImp.savePerson(eid, person);
			if(person1!=null)
			{
				System.out.println("Data Saved");
			}
			else
			{
				System.out.println("Unfortunately Data Not Saved");
			}
	}
	
	public  Person getPersonbyId(int pid)
	{
         Persondaoimpl daoImp =new Persondaoimpl();
         Person person1 = daoImp.getPersonbyId(pid);
		if(person1!=null)
		{
			return person1;
		}
		else
		{
			return null;
		}
	}
	public void deletePersonbyId(int pid)
	{
		 Persondaoimpl daoImp =new Persondaoimpl();
		boolean flag = daoImp.deletePersonbyid(pid);
		if(flag)
		{
			System.out.println("data deleted");
		}
		else
		{
			System.out.println("data not found");
		}
	}
	
	public Person updateMedorderbyid(int pid, Person person)
	{
		Persondaoimpl daoImp =new Persondaoimpl();
		Person person1 = daoImp.updatePerson(pid, person);
		if(person1!=null)
		{
			return person1;
		}
		else
		{
			return null;
		}
	}
	public List<Person> getAllPerson()
	{
		Persondaoimpl daoImp =new  Persondaoimpl();
		List<Person> list=daoImp.getAllPerson();
			if(list!=null)
			{
			
			return list;
		}
		else
		{
			return null;
		}
		
	}
	public List<Person> getPersonbyGender(String gender)
	{
		Persondaoimpl daoImp =new  Persondaoimpl();
		List<Person> list=daoImp.getPersonbyGender(gender);
			if(list!=null)
			{
			
			return list;
		}
		else
		{
			return null;
		}
		
	}
	public List<Person> getPersonbyAge(int age) 
	{
		Persondaoimpl daoImp =new  Persondaoimpl();
		List<Person> list=daoImp.getPersonbyAge(age);
			if(list!=null)
			{
			
			return list;
		}
		else
		{
			return null;
		}
		
	}
	public List<Person> getPersonbyPhone(long phno)
	{
		Persondaoimpl daoImp =new  Persondaoimpl();
		List<Person> list=daoImp.getPersonbyPhone(phno);
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
