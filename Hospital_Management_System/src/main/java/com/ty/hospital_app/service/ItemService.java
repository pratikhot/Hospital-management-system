package com.ty.hospital_app.service;
import java.util.List;
import com.ty.hospital_app.dao.impl.Itemdaoimpl;
import com.ty.hospital_app.dto.Item;

public class ItemService
{
	public void saveItem(int mid, Item item) 
	{
		Itemdaoimpl daoImp =new Itemdaoimpl();
		Item item1 = daoImp.saveItem(mid, item);
		if(item1!=null)
		{
			System.out.println("Data Saved");
		}
		else
		{
			System.out.println("Unfortunately Data Not Saved");
		}
		
	}
	public  Item getItembyId(int iid)
	{
		Itemdaoimpl daoImp =new Itemdaoimpl();
		Item item1 = daoImp.getItembyId(iid);
		if(item1!=null)
		{
			return item1;
		}
		else
		{
			return null;
		}
	}
	public void deleteItembyId(int iid)
	{
		Itemdaoimpl daoImp =new Itemdaoimpl();
		boolean flag = daoImp.deleteItembyid(iid);
		if(flag)
		{
			System.out.println("data deleted");
		}
		else
		{
			System.out.println("data not found");
		}
	}
	public Item updateItembyid(int iid, Item item)
	{
		Itemdaoimpl daoImp =new Itemdaoimpl();
		Item item1 = daoImp.updateItem(iid, item);
		if(item1!=null)
		{
			return item1;
		}
		else
		{
			return null;
		}
		
	}
	public List<Item> getAllItem()
	{
		Itemdaoimpl daoImp =new  Itemdaoimpl();
		List<Item> list=daoImp.getAllItem();
		
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
