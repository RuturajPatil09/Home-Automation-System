package com.demon.casestudy2;

//This part is implemented by Ruturaj Patil

import java.util.ArrayList;
import java.util.Scanner;

public class House
{
	int houseNumber;

	ArrayList<Room> rooms;
	
	public House() {
		// TODO Auto-generated constructor stub
	}

	public House(int houseNumber)
	{
		super();
		this.houseNumber = houseNumber;
		this.rooms = new ArrayList<Room>();
	}

	public int getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}

	public ArrayList<Room> getRooms() {
		return rooms;
	}
	
	public void addRoom(Room rooms)
	{
		int choice = -1;
		do
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("\t-----------------------------------------------");
			System.out.println("\t        Select the device you want to add      ");
			System.out.println("\t_______________________________________________");
			System.out.println("\t|       1. Television                         |");
			System.out.println("\t|       2. Air Conditioner                    |");
			System.out.println("\t|       3. Light                              |");
			System.out.println("\t|       4. Shower                             |");
			System.out.println("\t|       0. Exit                               |");
			System.out.println("\t-----------------------------------------------");
			
			System.out.println("\t Enter your choice : ");
			choice = sc.nextInt();
			
			switch(choice)
			{
				case 1:
				{
					rooms.addDevices(new Television("Off"));
					System.out.println("\t TELEVISION INSTALLED SUCCESSFULLY IN : " + rooms.getType());
					System.out.println("\t------------------------------------------------");
				}break;
				case 2:
				{
					rooms.addDevices(new AirConditioner("Off"));
					System.out.println("\t AIR CONDITIONER INSTALLED SUCCESSFULLY IN : " + rooms.getType());
					System.out.println("\t------------------------------------------------");
				}break;
				case 3:
				{
					rooms.addDevices(new Lights("Off"));
					System.out.println("\t LIGHTS INSTALLED SUCCESSFULLY IN : " + rooms.getType());
					System.out.println("\t------------------------------------------------");
				}break;
				case 4:
				{
					rooms.addDevices(new Shower("Off"));
					System.out.println("\t SHOWER INSTALLED SUCCESSFULLY IN : " + rooms.getType());
					System.out.println("\t------------------------------------------------");
				}break;
				
				default : System.out.println("\t------------------------ !!!!! INVALID CHOICE !!!! ------------------------------");
			}
		}while(choice != 0);
		
		this.rooms.add(rooms);
	}
	
	public void display()
	{
		for(Room ref :this.rooms)
		{
			System.out.println("\t Room : "+ref.getType());		}
	}
	
	
	
}
