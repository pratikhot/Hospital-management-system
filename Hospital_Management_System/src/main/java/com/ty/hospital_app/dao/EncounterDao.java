package com.ty.hospital_app.dao;

import java.util.List;

import com.ty.hospital_app.dto.Encounter;

public interface EncounterDao 
{
	public Encounter saveEncounter(int bid,Encounter encounter);
	
	public Encounter getEncounterbyId(int eid);
	
	public boolean  deleteEncounterbyId(int eid);
	
	public  Encounter updtaeEncounter(int eid,Encounter encounter);
	
	public List<Encounter> getAllEncounter();

}
