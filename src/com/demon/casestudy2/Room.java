package com.demon.casestudy2;

//This part is implemented by Ruturaj Patil

import java.util.ArrayList;


public class Room
{
	String type;
	ArrayList<Device> devices;
	
	public Room()
	{
		// TODO Auto-generated constructor stub
	}

	public Room(String name)
	{
		super();
		this.type = name;
		this.devices = new ArrayList<Device>();
	}

	public String getType()
	{
		return type;
	}

	public void setType(String type)
	{
		this.type = type;
	}

	public ArrayList<Device> getDevices()
	{
		return devices;
	}

	public void addDevices(Device devices)
	{
		this.devices.add(devices);
	}
	
	public void display()
	{
		System.out.println("\t Room : " + this.getType() + "\n\n");
	}
	
	
	
	
	
}
