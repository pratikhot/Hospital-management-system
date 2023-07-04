package com.ty.hospital_app.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Item 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int iid;
	private String iname;
	private int cost;
	private int quantity;
	@ManyToOne
	@JoinColumn
	private Medorder medorders;
	public int getIid() {
		return iid;
	}
	public void setIid(int iid) {
		this.iid = iid;
	}
	public String getIname() {
		return iname;
	}
	public void setIname(String iname) {
		this.iname = iname;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Medorder getMedorders() {
		return medorders;
	}
	public void setMedorders(Medorder medorders) {
		this.medorders = medorders;
	}

}
