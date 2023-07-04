package com.ty.hospital_app.service;
import java.util.List;


import com.ty.hospital_app.dao.impl.Medorderdaoimpl;

import com.ty.hospital_app.dto.Medorder;

public class MedorderService 
{
	public void saveMedorder(int eid, Medorder medorder)
	{
        Medorderdaoimpl daoImp =new Medorderdaoimpl();
		Medorder medorder1 = daoImp.saveMedorder(eid, medorder);
		if(medorder1!=null)
		{
			System.out.println("Data Saved");
		}
		else
		{
			System.out.println("Unfortunately Data Not Saved");
		}
		
	}
	public  Medorder getMedorderbyId(int mid)
	{
		Medorderdaoimpl daoImp =new Medorderdaoimpl();
		Medorder medorder1 = daoImp.getMedorderbyId(mid);
		if(medorder1!=null)
		{
			return medorder1;
		}
		else
		{
			return null;
		}
	}
	public void deleteMedorderbyId(int mid)
	{
		Medorderdaoimpl daoImp =new Medorderdaoimpl();
		boolean flag = daoImp.deleteMedorderbyId(mid);
		if(flag)
		{
			System.out.println("data deleted");
		}
		else
		{
			System.out.println("data not found");
		}
	}
	public Medorder updateMedorderbyid(int mid, Medorder medorder)
	{
		Medorderdaoimpl daoImp =new Medorderdaoimpl();
		Medorder medorder1 = daoImp.updateMedorder(mid, medorder);
		if(medorder1!=null)
		{
			return medorder1;
		}
		else
		{
			return null;
		}
		
	}
	public List<Medorder> getAllMedorder()
	{
		Medorderdaoimpl daoImp =new  Medorderdaoimpl();
		List<Medorder> list=daoImp.getAllmedorder();
		
			if(list!=null)
			{
			
			return list;
		}
		else
		{
			return null;
		}
	}
	public List<Medorder> getmedorderbyDocotorName(String name)
	{
		Medorderdaoimpl daoImp =new  Medorderdaoimpl();
		List<Medorder> list=daoImp.getmedorderbyDocotorName(name);
		
			if(list!=null)
			{
			
			return list;
		}
		else
		{
			return null;
		}
	}
	public List<Medorder> getmedorderbyDate(String Date)
	{
		Medorderdaoimpl daoImp =new  Medorderdaoimpl();
		List<Medorder> list=daoImp.getmedorderbyDocotorName(Date);
		
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
