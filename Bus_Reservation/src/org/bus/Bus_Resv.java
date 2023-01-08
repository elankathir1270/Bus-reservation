package org.bus;

import java.util.ArrayList;
import java.util.Scanner;

public class Bus_Resv {
	
	public static void main(String[] args) {
		
		ArrayList<Bus> buses=new ArrayList<Bus>();
		ArrayList<Booking> bookings=new ArrayList<Booking>();
		
		buses.add(new Bus(1,true,2));
		buses.add(new Bus(2,false,55));
		buses.add(new Bus(3,true,45));
		buses.add(new Bus(4,false,55));
		
		for(Bus b: buses) {
			b.displayBusInfo();
		}
		System.out.println();
		
		
		Scanner sc=new Scanner(System.in);
		int num=1;
		while(num==1) {
			System.out.println("enter 1 for booking and 2 for exit");
			 num = sc.nextInt();
			 if(num==1) {
		Booking booking=new Booking();
		
		if(booking.isAvailable(buses,bookings)) {
			bookings.add(booking);
			System.out.println("your booking is confirmed");
		}
		else {
			System.out.println("sorry seat is not available try another date");
		}
	}
 }
		
}
}