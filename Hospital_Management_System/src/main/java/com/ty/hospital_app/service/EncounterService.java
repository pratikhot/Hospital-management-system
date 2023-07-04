package com.ty.hospital_app.service;
import java.util.List;
import com.ty.hospital_app.dao.impl.Encounterdaoimpl;
import com.ty.hospital_app.dto.Encounter;

public class EncounterService {
	public void saveEncounter(int bid, Encounter encounter) 
	{
		Encounterdaoimpl daoImp =new Encounterdaoimpl();
		Encounter encounter1= daoImp.saveEncounter(bid, encounter);
		if(encounter1!=null)
		{
			System.out.println("Data Saved");
		}
		else
		{
			System.out.println("Unfortunately Data Not Saved");
		}
	}
	public  Encounter getEncounterbyId(int eid)
	{
		Encounterdaoimpl daoImp =new  Encounterdaoimpl();
		Encounter encounter1 = daoImp.getEncounterbyId(eid);
		if(encounter1!=null)
		{
			return encounter1;
		}
		else
		{
			return null;
		}
	}
	public void deleteEncounterbyId(int eid)
	{
		Encounterdaoimpl daoImp =new  Encounterdaoimpl();
		boolean flag = daoImp.deleteEncounterbyId(eid);
		if(flag)
		{
			System.out.println("data deleted");
		}
		else
		{
			System.out.println("data not found");
		}
	}
	public Encounter updateEncounterbyid(int eid, Encounter encounter)
	{
		Encounterdaoimpl daoImp =new  Encounterdaoimpl();
		Encounter encounter1= daoImp.updtaeEncounter(eid, encounter);
		if(encounter1!=null)
		{
			return encounter1;
		}
		else
		{
			return null;
		}
		
	}
	public List<Encounter> getAllEncounter()
	{
		Encounterdaoimpl daoImp =new  Encounterdaoimpl();
		List<Encounter> list=daoImp.getAllEncounter();
		
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
