package com.ty.hospital_app.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Branch {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bid;
	private String bname;
	private long phno;
	private String bemail;
    @JoinColumn
	@ManyToOne
	private Hospital hospitals;
    @JoinColumn
	@OneToOne
	private Address addresses;
	@OneToMany(mappedBy = "branches")
	private List<Encounter> encounteres;

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public long getPhno() {
		return phno;
	}

	public void setPhno(long phno) {
		this.phno = phno;
	}

	public String getBemail() {
		return bemail;
	}

	public void setBemail(String bemail) {
		this.bemail = bemail;
	}

	public Hospital getHospitals() {
		return hospitals;
	}

	public void setHospitals(Hospital hospitals) {
		this.hospitals = hospitals;
	}

	public Address getAddresses() {
		return addresses;
	}

	public void setAddresses(Address addresses) {
		this.addresses = addresses;
	}

	public List<Encounter> getEncounteres() {
		return encounteres;
	}

	public void setEncounteres(List<Encounter> encounteres) {
		this.encounteres = encounteres;
	}

}
