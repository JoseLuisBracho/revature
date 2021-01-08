package com.travelagent;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainFlights {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Flights> flightList = new ArrayList<>();
		
		flightList.add(new Flights(101, "AA-4587", "American Airlines", 458.25, 8.6, true));
		flightList.add(new Flights(152, "C-365", "Copa", 486.32, 6.9, true));
		flightList.add(new Flights(524, "LW-748", "Lufthansa", 487.89, 4.5, false));
		flightList.add(new Flights(201, "IB-25J6", "Iberia Airlines", 7854.2, 6.9, true));
		flightList.add(new Flights(136, "AA-2542", "American Airlines", 258.34, 4.8, true));
		flightList.add(new Flights(148, "D-36", "Delta Airlines", 698.45, 9.5, false));
		flightList.add(new Flights(965, "UAL-741", "United Airlines", 721.3, 4.3, false));
		flightList.add(new Flights(149, "AF-782", "Air France", 878.15, 9.5, true));
		flightList.add(new Flights(183, "QA-85LH", "Qatar Airlines", 2063.65, 6.9, true));
		flightList.add(new Flights(127, "C-886", "Copa", 474.64, 4.8, false));
		
		// New style using lambda expressions
		Collections.sort(flightList, (Flights f1, Flights f2) -> {
			Double d1 = f1.getCost();
			Double d2 = f2.getCost();
			return d1.compareTo(d2);
		});
		
		System.out.println("******* Printing all the flights sorting by cost (ascending) **********");
		printFlights(flightList);
		
		// Not needed comparable or comparator interfaces to have sort function of Collections up.
		
		Collections.sort(flightList, (Flights f1, Flights f2) -> {
			int fl = 0;
			Double d1 = f1.getRate();
			Double d2 = f2.getRate();
			fl = d2.compareTo(d1);
			
			if (fl==0) {
				Double d11 = f1.getCost();
				Double d22 = f2.getCost();
				fl = d11.compareTo(d22);
			}
			return fl;
		});
		
		System.out.println("\n\n******* Printing all the flights sorting first by rate and later by cost **********");
		System.out.println("********** Rate in descending order, Cost in ascending order ***********");
		printFlights(flightList);
		
		// Old style using comparable or comparator interfaces.
		Collections.sort(flightList); // Only one field allowed, implements Comparable, must be declared in the model class
		System.out.println("\n\n******** Printing all the products sorted by flightId *********");
		printFlights(flightList);
		
		Collections.sort(flightList, new FlightAvailableComparator());
		System.out.println("\n\n********* Printing all the flights sorted by availability ***********");
		printFlights(flightList);
		
		

	}
	
	public static void printFlights(List<Flights> flightList) {
		for (Flights flights : flightList) {
			System.out.println(flights);
		}
	}

}
