     package org.bus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Booking {
	
	private String name;
	private int busNo;
	private Date date;
	
	public Booking() {
		
		System.out.println("enter pasenger name:");
		Scanner sc=new Scanner(System.in);
		name =sc.nextLine();
		System.out.println("enter bus no");
		busNo =sc.nextInt();
		System.out.println("enter date");
		String dateInfo = sc.next();
		
		SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
		try {
			date=dateFormat.parse(dateInfo);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public boolean isAvailable(ArrayList<Bus> buses,ArrayList<Booking> bookings) {
		
		int capacity=0;
		for(Bus bus:buses) {
			if(bus.getBusNo()==busNo)
			capacity= bus.getCapacity();	
		}
		
		int booked=0;
		for(Booking b: bookings) {
			if(b.busNo==busNo && b.date.equals(date) )
				booked++;
		}
		return booked<capacity?true:false;

	}
	
	
	
}
