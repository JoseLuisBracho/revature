package com.travelagent;

public class Flights implements Comparable<Flights> {
	
	private int flightId;
	private String flightName;
	private String mnufacturerName;
	private double cost;
	private double rate;
	private boolean availability;
	
	public Flights() {
		// TODO Auto-generated constructor stub
	}

	public Flights(int flightId, String flightName, String mnufacturerName, double cost, double rate,
			boolean availability) {
		super();
		this.flightId = flightId;
		this.flightName = flightName;
		this.mnufacturerName = mnufacturerName;
		this.cost = cost;
		this.rate = rate;
		this.availability = availability;
	}

	public int getFlightId() {
		return flightId;
	}

	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}

	public String getFlightName() {
		return flightName;
	}

	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}

	public String getMnufacturerName() {
		return mnufacturerName;
	}

	public void setMnufacturerName(String mnufacturerName) {
		this.mnufacturerName = mnufacturerName;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public boolean isAvailability() {
		return availability;
	}

	public void setAvailability(boolean availability) {
		this.availability = availability;
	}

	@Override
	public String toString() {
		return "Flights [flightId=" + flightId + ", flightName=" + flightName + ", mnufacturerName=" + mnufacturerName
				+ ", cost=" + cost + ", rate=" + rate + ", availability=" + availability + "]";
	}

	@Override
	public int compareTo(Flights f) {
		// TODO Auto-generated method stub
		Integer flightId1 = this.flightId;
		Integer flightId2 = f.flightId;
		
		return flightId1.compareTo(flightId2);
	}
	
	

}
