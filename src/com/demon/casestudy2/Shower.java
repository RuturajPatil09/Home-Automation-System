package com.demon.casestudy2;
import java.time.LocalTime;
import java.time.Duration;
import java.time.temporal.ChronoUnit;

//This part is implemented by Amol Kolekar

public class Shower implements Device
{
	String name;
	String status;
	LocalTime timePeriod;
	
	public Shower() {
		// TODO Auto-generated constructor stub
	}

	public Shower(String status) {
		super();
		this.name = "Shower";
		this.status = status;
		this.timePeriod = LocalTime.now();
	}
	
	public String getDeviceName()
	{
		return this.name;
	}

	public boolean deviceOn()
	{
		if(this.status.equals("On"))
		{
			return false;
		}
		else
		{
			this.status = "On";
			Duration d = Duration.between(this.timePeriod, LocalTime.now());
			System.out.println("\n Device was OFF for : " + d.get(ChronoUnit.SECONDS));
			return true;
		}
	}

	
	public boolean deviceOff()
	{
		if(this.status.equals("Off"))
		{
			return false;
		}
		else
		{
			this.status = "Off";
			Duration d = Duration.between(this.timePeriod, LocalTime.now());
			System.out.println("\n Device was ON for : " + d.get(ChronoUnit.SECONDS));
			return true;
		}
	}


	public void checkDeviceStatus()
	{
		if(this.status.equals("On"))
		{
			System.out.println("\t SHOWER is ON ");
		}
		else
		{
			System.out.println("\t SHOWER is OFF ");
		}
	}
	
}
