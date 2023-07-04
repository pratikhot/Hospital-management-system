package com.ty.hospital_app.service;




import java.util.List;

import com.ty.hospital_app.dao.impl.Branchdaoimpl;

import com.ty.hospital_app.dto.Branch;

public class BranchService
{
	public void saveBranch(int hid, Branch branch) 
	{
		Branchdaoimpl daoImp =new  Branchdaoimpl();
		Branch branch1= daoImp.saveBranch(hid, branch);
		if(branch1!=null)
		{
			System.out.println("Data Saved");
		}
		else
		{
			System.out.println("Unfortunately Data Not Saved");
		}
	}
	
	public  Branch getBranchbyId(int bid)
	{
		Branchdaoimpl daoImp =new  Branchdaoimpl();
		Branch branch1 = daoImp.getBranchbyId(bid);
		if(branch1!=null)
		{
			return branch1;
		}
		else
		{
			return null;
		}
	}
	public void deleteBranchbyId(int bid)
	{
		Branchdaoimpl daoImp =new  Branchdaoimpl();
		boolean flag = daoImp.deleteBranchbyhId(bid);
		if(flag)
		{
			System.out.println("data deleted");
		}
		else
		{
			System.out.println("data not found");
		}
	}
	public Branch updateBranchbyid(int bid, Branch branch)
	{
		Branchdaoimpl daoImp =new  Branchdaoimpl();
		Branch branch1= daoImp.updateBranch(bid, branch);
		if(branch1!=null)
		{
			return branch1;
		}
		else
		{
			return null;
		}
		
	}
	public List<Branch> getAllBranch()
	{
		Branchdaoimpl daoImp=new Branchdaoimpl();
		List<Branch> list=daoImp.getAllBranch();
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
