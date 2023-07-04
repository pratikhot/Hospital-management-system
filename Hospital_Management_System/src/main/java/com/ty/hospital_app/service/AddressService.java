package com.ty.hospital_app.service;

import java.util.List;

import com.ty.hospital_app.dao.impl.Addressdaoimpl;

import com.ty.hospital_app.dto.Address;

public class AddressService 
{
	public void saveAddress(int bid, Address address)
	{
		Addressdaoimpl daoImp =new  Addressdaoimpl();
		Address address1 = daoImp.saveAddress(bid, address);
		if(address1!=null)
		{
			System.out.println("Data Saved");
		}
		else
		{
			System.out.println("Unfortunately Data Not Saved");
		}
	}
	
	public  Address getAddressbyId(int aid)
	{
		Addressdaoimpl daoImp =new  Addressdaoimpl();
		Address address1 = daoImp.getAddressbyId(aid);
		if(address1!=null)
		{
			return address1;
		}
		else
		{
			return null;
		}
	}
	public void deleteAddressbyId(int aid)
	{
		Addressdaoimpl daoImp =new  Addressdaoimpl();
		boolean flag = daoImp.deleteAddressbyId(aid);
		if(flag)
		{
			System.out.println("data deleted");
		}
		else
		{
			System.out.println("data not found");
		}
	}
	
	public Address updateAddressbyid(int aid, Address address)
	{
		Addressdaoimpl daoImp =new  Addressdaoimpl();
		Address address1= daoImp.updateAddress(aid, address);
		if(address1!=null)
		{
			return address1;
		}
		else
		{
			return null;
		}
		
	}
	public List<Address> getAllAddress()
	{
		Addressdaoimpl daoImp =new  Addressdaoimpl();
		List<Address> list=daoImp.getAddressall();
		
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
