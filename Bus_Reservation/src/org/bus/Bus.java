package org.bus;

public class Bus {
	
	private int busNo;
	private boolean ac;
	private int Capacity;
	
	public Bus(int busNo,boolean ac,int Capacity) {
		
		this.busNo=busNo;
		this.ac=ac;
		this.Capacity=Capacity;
	}

	public int getBusNo() {
		return busNo;
	}

	public void setBusNo(int busNo) {
		this.busNo = busNo;
	}

	public boolean getAc() {
		return ac;
	}

	public void setAc(boolean ac) {
		this.ac = ac;
	}

	public int getCapacity() {
		return Capacity;
	}

	public void setCapacity(int capacity) {
		Capacity = capacity;
	}
	
	public void displayBusInfo() {
		System.out.println("Bus No: "+busNo+" AC/NonAC: "+ac+" Capasity: "+Capacity);
		
	}
		

}
