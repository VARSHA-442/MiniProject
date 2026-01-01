package com.thomas.travels;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		//1st question whether category is car or not
		isCarDrive();
		
		Travel travel=new Travel();
		Driver driver1=new Driver(123,"lorry","chintu",126.33);
		Driver driver2=new Driver(122,"car","rahul",185.33);
		Driver driver3=new Driver(125,"bus","pinky",189.33);
		Driver driver4=new Driver(126,"scooty","monkey",175.33);
		Driver driver5=new Driver(127,"car","indu",165.33);
		
		ArrayList<Driver> driverslist=new ArrayList<Driver>();
		driverslist.add(driver1);
		driverslist.add(driver2);
		driverslist.add(driver3);
		driverslist.add(driver4);
		driverslist.add(driver5);
		
		
		//2nd question fetching the driver details by driver id
		
		travel.retrivebyDriverId(driverslist, 122);
		
		//3rd question counting the particular type of category
		
		int countOfCategory=travel.retrieveCountOfDriver(driverslist,"car");
		
		System.out.println("the count of the category is "+countOfCategory);
		
		//4th question for retrieving drivers of particular category type
		
		ArrayList<Driver> carDrivers = travel.retrieveDriver(driverslist, "car");
        System.out.println("List of Car Drivers:");
        for (Driver driver : carDrivers) {
            System.out.println(driver.getDriverName());
        }
        
        //5th question maximum distance travelled
        
        Driver maximumDistance=travel.maximumDistanceMethod(driverslist);
        System.out.println("maximum distance travelled by "+maximumDistance.getDriverName());
	}

	
	private static void isCarDrive() {
		Driver driver=new Driver(256,"car","somesh",180.36);
		Travel travel =new Travel();
		System.out.println(travel.isCarDriver(driver));
	}
}

