package com.ty.hospital_app.service;
import com.ty.hospital_app.dao.impl.Hospitaldaoimpl;
import com.ty.hospital_app.dto.Hospital;

public class HospitalService 
{
	public void saveHospital(Hospital hospital)
	{
		Hospitaldaoimpl daoImp =new  Hospitaldaoimpl();
		Hospital hospital1 = daoImp.saveHospital(hospital);
		if(hospital1!=null)
		{
			System.out.println("Data Saved");
		}
		else
		{
			System.out.println("Unfortunately Data Not Saved");
		}
	}

	public Hospital getHospitalbyId(int hid)
	{
		Hospitaldaoimpl daoImp =new  Hospitaldaoimpl();
		Hospital hospital1 = daoImp.getHospitalbyId(hid);
		if(hospital1!=null)
		{
			return hospital1;
		}
		else
		{
			return null;
		}
	}
	public void deleteHospitalbyId(int hid)
	{
		Hospitaldaoimpl daoImp =new  Hospitaldaoimpl();
		boolean flag = daoImp.deleteHospitalbyId(hid);
		if(flag)
		{
			System.out.println("data deleted");
		}
		else
		{
			System.out.println("data not found");
		}
	}
	
	public Hospital updateHospitalbyid(int hid, Hospital hospital)
	{
		Hospitaldaoimpl daoImp =new  Hospitaldaoimpl();
		Hospital hospital1 = daoImp.updateHospital(hid, hospital);
		if(hospital1!=null)
		{
			return hospital1;
		}
		else
		{
			return null;
		}
		
	}
	

}
