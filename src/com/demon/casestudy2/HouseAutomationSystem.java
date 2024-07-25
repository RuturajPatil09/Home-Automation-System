package com.demon.casestudy2;

// This part is implemented and designed by Ruturaj Patil

import java.util.Scanner;

public class HouseAutomationSystem {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\t Enter the house number : ");
		int num = sc.nextInt();
		House h1 = new House(num);
		int choice1 = -1;
		do
		{
			System.out.println("\t|-----------------------------------------------------------|");
			System.out.println("\t| 1. Add a room                                             |");
			System.out.println("\t| 2. Display Rooms                                          |");
			System.out.println("\t| 3. Check the situations of Appliances in each room        |");
			System.out.println("\t| 4. ON / OFF a DEVICE                                      |");
			System.out.println("\t| 0. Exit                                                   |");
			System.out.println("\t|___________________________________________________________|");
			System.out.println("\t Enter your choice : ");
			choice1 = sc.nextInt();
			
			switch(choice1)
			{
				case 1:
				{
					System.out.println("\t|-------------------------------------------------------|");
					System.out.println("\t|   1. KITCHEN                                          |");
					System.out.println("\t|   2. LIVING AREA                                      |");
					System.out.println("\t|   3. BATHROOM                                         |");
					System.out.println("\t|   4. BEDROOM                                          |");
					System.out.println("\t|   5. DINNING ROOM                                     |");
					System.out.println("\t|   6. CORRIDOOR                                        |");
					System.out.println("\t|_______________________________________________________|");
					System.out.println("\t   Select the room you want to enter : ");
					System.out.println("\t Enter the Room type : ");
					int sel = sc.nextInt();
					String type=null;
					switch(sel)
					{
						case 1:
						{
							type = "KITCHEN";
							h1.addRoom(new Room(type));
						}break;
						
						case 2:
						{
							type = "LIVING AREA";
							h1.addRoom(new Room(type));
						}break;
						
						case 3:
						{
							type = "BATHROOM";
							h1.addRoom(new Room(type));
						}break;
						
						case 4:
						{
							type = "BED ROOM";
							h1.addRoom(new Room(type));
						}break;
						
						case 5:
						{
							type = "DINING ROOM";
							h1.addRoom(new Room(type));
						}break;
						
						case 6:
						{
							type = "CORRIDOOR";
							h1.addRoom(new Room(type));
						}break;
						
						default : System.out.println("\n\t ----------------------------------INVALID CHOICE ---------------------------");
					}
					
				}break;
				
				case 2:
				{
					System.out.println("\n\t                                 ROOMS ARE : ");
					System.out.println(" \n\t-----------------------------------------------------------------------------------");
					for(Room ref : h1.getRooms())
					{
						ref.display();
					}
					System.out.println("\t-----------------------------------------------------------------------------------");
				}break;
				case 3:
				{
					System.out.println("\n\t                                   DEVICE STATUS                 ");
					System.out.println(" \n\t-----------------------------------------------------------------------------------");
					for(Room ref:h1.getRooms())
					{
						System.out.println(" Device status in " + ref.getType() + " is : ");
						for(Device ref1 : ref.getDevices())
						{
							ref1.checkDeviceStatus();
						}
					}
					System.out.println("\t-----------------------------------------------------------------------------------");
				}break;
				
				
				case 4:
				{
					System.out.println("\n\t                                 ROOMS ARE : ");
					System.out.println(" \n\t-----------------------------------------------------------------------------------");
					for(Room ref : h1.getRooms())
					{
						ref.display();
					}
					System.out.println("\t-----------------------------------------------------------------------------------");
					
					System.out.println("\t|-------------------------------------------------------|");
					System.out.println("\t|   1. KITCHEN                                          |");
					System.out.println("\t|   2. LIVING AREA                                      |");
					System.out.println("\t|   3. BATHROOM                                         |");
					System.out.println("\t|   4. BEDROOM                                          |");
					System.out.println("\t|   5. DINNING ROOM                                     |");
					System.out.println("\t|   6. CORRIDOR                                         |");
					System.out.println("\t|_______________________________________________________|");
					System.out.println("\t   Select the room you want to enter : ");
					int choice4 = sc.nextInt();
					
					switch(choice4)
					{
						case 1:
						{
							for(Room ref : h1.getRooms())
							{
								if(ref.getType().equals("KITCHEN"))
								{
									onOffDevices(ref);
									break;
								}
							}
						}break;
						
						case 2:
						{
							for(Room ref : h1.getRooms())
							{
								if(ref.getType().equals("LIVING AREA"))
								{
									onOffDevices(ref);
									break;
								}
							}
						}break;
						
						case 3:
						{
							for(Room ref : h1.getRooms())
							{
								if(ref.getType().equals("BATHROOM"))
								{
									onOffDevices(ref);
									break;
								}
							}
						}break;
						
						case 4:
						{
							for(Room ref : h1.getRooms())
							{
								if(ref.getType().equals("BED ROOM"))
								{
									onOffDevices(ref);
									break;
								}
							}
						}break;
						
						case 5:
						{
							for(Room ref : h1.getRooms())
							{
								if(ref.getType().equals("DINING ROOM"))
								{
									onOffDevices(ref);
									break;
								}
							}
						}break;
						
						case 6:
						{
							for(Room ref : h1.getRooms())
							{
								if(ref.getType().equals("CORRIDOOR"))
								{
									onOffDevices(ref);
									break;
								}
							}
						}break;
						
					}

				}break;
				
				case 0:
				{
					System.out.println("\n\t !!!!!!!!!!!!!!!!!!!!!!!! ENDING !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
				}break;
				
				default : System.out.println(" INVALID CHOICE ");
				
			}
			
		}while(choice1 != 0);
		
		sc.close();
		
	}
	
	
	public static boolean onOffDevices(Room ref)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("\t|--------------------------------------------------------------|");
		System.out.println("\t|       SELECT THE DEVICE YOU WANT TO TURN ON OR OFF           |");
		System.out.println("\t|       1. Television                                          |");
		System.out.println("\t|       2. AIR CONDITIONER                                     |");
		System.out.println("\t|       3. LIGHTS                                              |");
		System.out.println("\t|       4. SHOWER                                              |");
		System.out.println("\t|______________________________________________________________|");
		System.out.println("\t  ENTER YOUR CHOICE : ");
		
		int choice3 = sc.nextInt();
		
		switch(choice3)
		{
			case 1:
			{
				for(Device ctr : ref.getDevices())
				{
					if(ctr.getDeviceName().equals("Television"))
					{
						System.out.println("\n\t Do you want to turn on or off your device ");
						System.out.println("\n\t     1. ON  ");
						System.out.println("\n\t     2. OFF ");
						int onoff = sc.nextInt();
						
						switch(onoff)
						{
							case 1:
							{
								ctr.deviceOn();
							}break;
							
							case 2:
							{
								ctr.deviceOff();
							}break;
							
							default : System.out.println("\n\t!!!!!!!!!!!!!!!! INVALID CHOICE !!!!!!!!!!!!!!!!!!");
						}
						return true;
					}
				}
				return false;
			}
			
			case 2:
			{
				for(Device ctr : ref.getDevices())
				{
					if(ctr.getDeviceName().equals("AirConditioner"))
					{
						System.out.println("\n\t Do you want to turn on or off your device ");
						System.out.println("\n\t     1. ON  ");
						System.out.println("\n\t     2. OFF ");
						int onoff = sc.nextInt();
						
						switch(onoff)
						{
							case 1:
							{
								ctr.deviceOn();
							}break;
							
							case 2:
							{
								ctr.deviceOff();
							}break;
							
							default : System.out.println("\n\t!!!!!!!!!!!!!!!! INVALID CHOICE !!!!!!!!!!!!!!!!!!");
						}
						return true;
					}
				}
				return false;
			}
			
			case 3:
			{
				for(Device ctr : ref.getDevices())
				{
					if(ctr.getDeviceName().equals("Light"))
					{
						System.out.println("\n\t Do you want to turn on or off your device ");
						System.out.println("\n\t     1. ON  ");
						System.out.println("\n\t     2. OFF ");
						int onoff = sc.nextInt();
						
						switch(onoff)
						{
							case 1:
							{
								ctr.deviceOn();
							}break;
							
							case 2:
							{
								ctr.deviceOff();
							}break;
							
							default : System.out.println("\n\t!!!!!!!!!!!!!!!! INVALID CHOICE !!!!!!!!!!!!!!!!!!");
						}
						return true;
					}
				}
				return false;
			}
			
			case 4:
			{
				for(Device ctr : ref.getDevices())
				{
					if(ctr.getDeviceName().equals("Shower"))
					{
						System.out.println("\n\t Do you want to turn on or off your device ");
						System.out.println("\n\t     1. ON  ");
						System.out.println("\n\t     2. OFF ");
						int onoff = sc.nextInt();
						
						switch(onoff)
						{
							case 1:
							{
								ctr.deviceOn();
							}break;
							
							case 2:
							{
								ctr.deviceOff();
							}break;
							
							default : System.out.println("\n\t!!!!!!!!!!!!!!!! INVALID CHOICE !!!!!!!!!!!!!!!!!!");
						}
						return true;
					}
				}
				return false;
			}
			
			default : System.out.println("\n\t!!!!!!!!!!!!!!!!!!!!!!!! INVALID CHOICE !!!!!!!!!!!!!!!!!!!!!!!!!! ");
			sc.close();
			return false;
			
		}
	}

}
