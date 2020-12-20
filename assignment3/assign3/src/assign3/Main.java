package assign3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Task1) Try to play around with all the methods shown above
		
		List vw = new LinkedList();
		vw.add("Jetta");
		vw.add("New Beatle");
		
		List cars = new LinkedList();
		
		cars.add("Explorer");
		cars.add("Camaro");
		cars.add(null);
		cars.add("Mustang");
		cars.add(vw);  // Create a list of list, only w/ raw type
		
		System.out.println("Initial collection");
		System.out.println("Cars: " + cars);
		
		cars.add(2, "Javeline");
		vw.add(1, "Wolf");
		
		System.out.println("\nElement added at position 3 and in position 2 of wv list");
		System.out.println("Cars: " + cars);
		
		cars.remove(1);  // Remove an element by index
		cars.remove(null); // Remove an element by name
		System.out.println("\nRemove element at position 2 and null");
		System.out.println("Cars: " + cars);
		System.out.println("The current size of cars is: " + cars.size()); // Inner list count by 1
		
		System.out.println("\nUsing Objects (car in cars) in a forEach loop");
		for (Object o : cars) {
			System.out.println(o + " to UpperCase: " + o.toString().toUpperCase());
		}
		
		Collections.reverse(cars);
		Collections.reverse(vw);
		System.out.println("\nCars list in reverse order: " + cars);
		
		// Collections.sort(cars);  // Cannot be implemented, it throws a cast exception due to inner list
		// System.out.println("\nCars sorted in descending order: " + cars);
		// Due to this BinarySearch can't be implemented
		
		Collections.replaceAll(cars, "Explorer", "Escape");
		System.out.println("\nReplace all coincidences of Explorer: " + cars);
		
		List ford = new LinkedList();
		ford.add("Mustang");
		ford.add("Escape");
		cars.retainAll(ford);
		System.out.println("\nOnly ford vehicles: " + cars);
		
		cars.removeAll(ford);
		System.out.println("\nAll vehicles sold out " + cars);
		
		// Task2) Repeat the arrays problems given earlier here using Lists
		ArrayList<Double> doubList = new ArrayList<>();
		ArrayList<Integer> intList = new ArrayList<>();
		
		Random r = new Random(1001); // 1001 is a seed
		
		for (int i = 0; i < 20; i++) {
			doubList.add(r.nextDouble()*1000);
			
		}
		
		for (int i = 0; i < 20; i++) {
			intList.add(r.nextInt(1000));
		}
		
		System.out.println("\n\nOriginal Double-Type array: " + doubList);
		System.out.println("\nOriginal Integer-Type array: " + intList);
		
		// *1)Print the array in reverse order
		Collections.reverse(doubList);
		System.out.println("\nDuble array in reverse order: " + doubList);
		
		// *2)Delete specific element from an array
		doubList.remove(488.0659899159199); // 3rd element
		System.out.println("\n3rd element 488.0659899159199 removed: " + doubList);
		
		// *3)Find all the even numbers and put it in a new array and also find all odd numbers and put it in another array
		ArrayList<Integer> evenInteger = new ArrayList<>();
		ArrayList<Integer> oddInteger = new ArrayList<>();
		for (Integer i : intList) {
			if (i%2==0) {
				evenInteger.add(i);
			} else {
				oddInteger.add(i);
			}
		}
		
		System.out.println("\nArray of even numbers in IntList: " + evenInteger);
		System.out.println("\nArray of odd numbers in IntList: " + oddInteger);
		
		// *4)Find the sum of all even and odd numbers seperately and print the max out of it.(max of sum of even vs odd)
		Integer sumOddInt = 0;
		for (Integer i : oddInteger) {
			sumOddInt += i;
		}
		Integer sumEvenInt = 0;
		for (Integer i : evenInteger) {
			sumEvenInt += i;
		}
		
		if (sumOddInt > sumEvenInt) {
			System.out.println("\nThe greater sum is in Odd numbers: " + sumOddInt);
		} else if (sumOddInt < sumEvenInt) {
			System.out.println("\nThe greater sum is in Even numbers: " + sumEvenInt);
		} else {
			System.out.println("\nBoth sums have the same value: " + sumOddInt);
		}
		
		// *5)Find the minimum and the maximum element in an array
		Double minDouble = Collections.min(doubList);
		System.out.println("\nMinimum value in Double array: " + minDouble);
		Double maxDouble = Collections.max(doubList);
		System.out.println("\nMaximum value in Double array: " + maxDouble);
		
		// *6)Find all Palindrome numbers in an array
		ArrayList<Integer> palinList = new ArrayList<>();
		for (Integer i : intList) {
			String p = i+"";
			if (new StringBuffer(p).reverse().toString().equals(p)) {
				palinList.add(i);
			}
		}
		
		System.out.println("\nPalindrome numbers in Integer Array: " + palinList);
		
				
		// Task3) Explore Queue Interface and try implementing Queue using LinkedList and PriorityQueue, and get the difference between them
		Queue<Integer> ql = new LinkedList<>(); // Queue Interface needs a concrete class (LinkedList)
		ql.add(12);                             // First in first out (FIFO)
		ql.add(48);
		ql.add(953);
		
		Random rq = new Random(501); // 501 is a seed
		for (int i = 0; i < 4; i++) {
			ql.add(rq.nextInt(1000));	
		}
		
		System.out.println("\nQueue Collection using LinkedList: " + ql);
		System.out.println("Using LinkedList collection preserves the order of insertion");
		System.out.println("Size of ql: " + ql.size());
		ql.remove();
		System.out.println("Remove the 1st element of ql: " + ql);
		System.out.println("The current 1st element is now: " + ql.peek());
		System.out.println("peek method shows and deletes the head element: " + ql.poll());
		System.out.println("New ql collectio: " + ql);
		
		Queue<String> qls = new LinkedList<>();
		qls.add("Mustang");
		qls.add("Camaro");
		qls.add("Focus");
		qls.add("C320");
		
		System.out.println("\nQueue Collection using LinkedList: " + qls);
		System.out.println("Size of qls: " + qls.size());
		qls.remove();
		System.out.println("Remove the 1st element of qls: " + qls);
		System.out.println("The current 1st element is now: " + qls.peek());
		
		Queue<Integer> qpl = new PriorityQueue<>(); // Queue Interface needs a concrete class (PriorityQueue)
		qpl.add(12);
		qpl.add(48);
		qpl.add(953);
		
		for (int i = 0; i < 4; i++) {
			qpl.add(rq.nextInt(1000));	
		}
		
		System.out.println("\nQueue Collection using Priority Queue: " + qpl);
		System.out.println("Using PriorityQueue collection loss the order of insertion");
		System.out.println("Size of ql: " + qpl.size());
		qpl.remove();
		System.out.println("Remove the 1st element of qpl: " + qpl);
		System.out.println("The current 1st element is now: " + qpl.peek());
		
		
		Queue<String> qpls = new PriorityQueue<>();
		qpls.add("Mustang");
		qpls.add("Camaro");
		qpls.add("Focus");
		qpls.add("C320");
		
		System.out.println("\nQueue Collection using Priority Queue: " + qpls);
		System.out.println("Size of ql: " + qpls.size());
		qpls.remove();
		System.out.println("Remove the 1st element of qpls: " + qpls);
		System.out.println("The current 1st element is now: " + qpls.peek());
		
		
		// Create a Custom Checked exception if the entered DL is valid or not.
		// CollectionTasks.java class is as a business layer
		CollectionTasks exception = new CollectionTasks();
		String driverLicense = "25648765";
		try {
			exception.isValidDL(driverLicense);
			System.out.println("\nValid driver license: " + driverLicense);
		} catch (DLException e) {
			System.out.println(e);
		}
		
		// Create a Custom Unchecked exception for checking if the entered Passport number is valid or not
		String passport = "421578634";
		try {
		exception.isValidPassport(passport); // programmer decides if handle this exception
		System.out.println("\nPassport number " + passport + " is validated");
		} catch(PassportException e) {
			System.out.println(e);
		}
		
		// Try addAll() removeAll() retainAll() in set collections
		
		Set<String> hs = new HashSet<>();
		hs.add("Mustang");
		hs.add("Camaro");
		hs.add("C320");
		hs.add(null);
		hs.add("Jetta");
		hs.add("mustang");
		hs.add("Exlorer");
		hs.add("Laredo");
		hs.add(null);
		System.out.println("\nCollection Set using HashSet class");
		System.out.println("Cars set is: " + hs);
		System.out.println("Amount of unique cars: " + hs.size());
		System.out.println("Camaro in cars? " + hs.contains("Camaro"));
		System.out.println("Jetta remove " + hs.remove("Jetta"));
		System.out.println("New set of cars: " + hs);
		
		Set<String> newCars = new HashSet<>();
		newCars.add("Corolla");
		newCars.add("Armada");
		newCars.add("Z24");
		
		hs.addAll(newCars); // Union operation
		System.out.println("\nAfter adding new Cars: " + hs);
		
		Set<String> oldBrand = new HashSet<>();
		oldBrand.add("Camaro");
		oldBrand.add("mustang");
		oldBrand.add("Z24");
		oldBrand.add("Malibu");
		oldBrand.add("Capricce");
		
		hs.retainAll(oldBrand); // Intersection operation
		System.out.println("\nOld model cars in set: " + hs);
		
		Set<String> rm = new HashSet<>();
		rm.add("Z24");
		rm.add("mustang");
		
		hs.removeAll(rm); // Difference operation
		System.out.println("\nSet of cars after removing: " + hs);
		
		
		Set<String> lhs = new LinkedHashSet<>(); //Preserves the order of insertion
		lhs.add("Mustang");
		lhs.add("Camaro");
		lhs.add("C320");
		lhs.add(null);
		lhs.add("Jetta");
		lhs.add("mustang");
		lhs.add("Exlorer");
		lhs.add("Laredo");
		lhs.add(null);
		System.out.println("\nCollection Set using LinhedHashSet class");
		System.out.println("Cars set is: " +lhs);
		System.out.println("Amount of unique cars: " + lhs.size());
		System.out.println("Camaro in cars? " + lhs.contains("Camaro"));
		System.out.println("Jetta remove " + lhs.remove("Jetta"));
		System.out.println("New set of cars: " + lhs);
		
		Set<String> ts = new TreeSet<>(); //Does not accept null values, order elements (ascending this case)
		ts.add("Mustang");
		ts.add("Camaro");
		ts.add("C320");
		//ts.add(null);
		ts.add("Jetta");
		ts.add("mustang");
		ts.add("Exlorer");
		ts.add("Laredo");
		//ts.add(null);
		System.out.println("\nCollection Set using LinhedHashSet class");
		System.out.println("Cars set is: " +ts);
		System.out.println("Amount of unique cars: " + ts.size());
		System.out.println("Camaro in cars? " + ts.contains("Camaro"));
		System.out.println("Jetta remove " + ts.remove("Jetta"));
		System.out.println("New set of cars: " + ts);
		

	}

}
