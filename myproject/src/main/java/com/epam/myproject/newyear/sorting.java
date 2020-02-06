package com.epam.myproject.newyear;

import java.util.TreeMap;

public class sorting extends sweets {
	TreeMap<String,Integer> asd= new TreeMap<String,Integer>();
	public void setvalues(String name,int weight)
	{
		asd.put(name,weight);
	}
	public void getvalues()
	{
		System.out.println(asd);
		
	}
	TreeMap<Integer, String> wei= new TreeMap<Integer, String>();
	public void setvaluesbyweight(int weight,String name )
	{
		wei.put(weight,name); 
	}
	public void getvaluesbyweight()
	{
		System.out.println(wei);
		
	}

}