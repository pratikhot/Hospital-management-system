package com.ty.hospital_app.dao;

import java.util.List;

import com.ty.hospital_app.dto.Medorder;

public interface MedorderDao
{
	public Medorder saveMedorder(int eid ,Medorder medorder);
	
	public Medorder getMedorderbyId(int mid);
	
	public boolean deleteMedorderbyId(int mid);
	
	public Medorder updateMedorder(int mid,Medorder medorder);
	
	public List<Medorder> getAllmedorder();
	
	public List<Medorder> getmedorderbyDocotorName(String name);
	
	public List<Medorder> getmedorderbyDate(String date);
	

}
