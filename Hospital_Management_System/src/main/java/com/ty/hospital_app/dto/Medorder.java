package com.ty.hospital_app.dto;


import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Medorder 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int mid;
	private String dname;
	private String orderdate;
	private int total;
	@OneToMany(mappedBy = "medorders")
	private List<Item> items;
	@ManyToOne
	@JoinColumn
	private Encounter  encounteres;
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getOrderdate() {
		return orderdate;
	}
	public void setOrderdate(String orderdate) {
		this.orderdate = orderdate;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public List<Item> getItems() {
		return items;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	}
	public Encounter getEncounteres() {
		return encounteres;
	}
	public void setEncounteres(Encounter encounteres) {
		this.encounteres = encounteres;
	}
	
	
	

}
