package com.ty.hospital_app.dao;

import com.ty.hospital_app.dto.Hospital;

public interface HospitalDao
{
	public Hospital saveHospital(Hospital hospital);
	
	public Hospital getHospitalbyId(int hid);
	
	public boolean deleteHospitalbyId(int hid);
	
	public Hospital updateHospital(int hid,Hospital hospital);
	
}
