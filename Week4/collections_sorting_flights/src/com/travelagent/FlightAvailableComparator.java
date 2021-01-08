package com.travelagent;

import java.util.Comparator;

public class FlightAvailableComparator implements Comparator<Flights>{

	@Override
	public int compare(Flights o1, Flights o2) {
		// TODO Auto-generated method stub
		Boolean flightAvail1 = o1.isAvailability();
		Boolean flightAvail2 = o2.isAvailability();
		return flightAvail1.compareTo(flightAvail2);
	}
	
	

}
