package com.revature.model;

public class Bus {
	private String busReg;
    private String Type; // Ac or NonAc
    private int numberOfBerths;
    private int numberOfSeats;
	
    public Bus() {
		super();
		// TODO Auto-generated constructor stub
	}
    
   public Bus(String busReg, String type, int numberOfBerths, int numberOfSeats) {
		super();
		this.busReg = busReg;
		Type = type;
		this.numberOfBerths = numberOfBerths;
		this.numberOfSeats = numberOfSeats;
	}



public String getBusReg() {
	return busReg;
}

public void setBusReg(String busReg) {
	this.busReg = busReg;
}

public String getType() {
	return Type;
}

public void setType(String type) {
	Type = type;
}

public int getNumberOfBerths() {
	return numberOfBerths;
}

public void setNumberOfBerths(int numberOfBerths) {
	this.numberOfBerths = numberOfBerths;
}

public int getNumberOfSeats() {
	return numberOfSeats;
}

public void setNumberOfSeats(int numberOfSeats) {
	this.numberOfSeats = numberOfSeats;
}


@Override
public String toString() {
	return "Bus [busReg=" + busReg + ", Type=" + Type + ", numberOfBerths=" + numberOfBerths + ", numberOfSeats="
			+ numberOfSeats + "]";
}
	
    
}
