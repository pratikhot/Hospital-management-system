package com.ty.hospital_app.service;
import java.util.List;
import com.ty.hospital_app.dao.impl.Observationdaoimpl;
import com.ty.hospital_app.dto.Observation;

public class ObservationService 
{
	public void saveObservation(int eid, Observation observation) 
	{
		Observationdaoimpl daoImp =new Observationdaoimpl();
		Observation observation1 = daoImp.saveObservation(eid, observation);
		if(observation1!=null)
		{
			System.out.println("Data Saved");
		}
		else
		{
			System.out.println("Unfortunately Data Not Saved");
		}
		
	}
	public  Observation getObservationbyId(int oid)
	{
		Observationdaoimpl daoImp =new Observationdaoimpl();
		Observation observation1 = daoImp.getObservationbyId(oid);
		if(observation1!=null)
		{
			return observation1;
		}
		else
		{
			return null;
		}
	}
	public void deleteObservationbyId(int oid)
	{
		Observationdaoimpl daoImp =new Observationdaoimpl();
		boolean flag = daoImp.deleteObservationbyId(oid);
		if(flag)
		{
			System.out.println("data deleted");
		}
		else
		{
			System.out.println("data not found");
		}
	}
	public Observation updateObservationbyid(int oid, Observation observation)
	{
		Observationdaoimpl daoImp =new Observationdaoimpl();
		Observation observation1= daoImp.updateObservation(oid, observation);
		if(observation1!=null)
		{
			return observation1;
		}
		else
		{
			return null;
		}
		
	}
	public List<Observation> getAllObservation()
	{
		Observationdaoimpl daoImp =new  Observationdaoimpl();
		List<Observation> list=daoImp.getAllObservation();
			if(list!=null)
			{
			
			return list;
		}
		else
		{
			return null;
		}
	}
	public List<Observation>getObservationBydoctorName(String dname)
	{
		Observationdaoimpl daoImp =new  Observationdaoimpl();
		List<Observation> list=daoImp.getObservationBydoctorName(dname);
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
