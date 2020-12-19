package assign2;

import java.util.Arrays;

public class ArraysTasks {
	
	// *1)Print the array in reverse order
	
	public static int[] reverseOrder(int[] a) {
		int n = a.length;
		int[] b = new int[n];
		for (int i = 0, j=n-1; i < n; i++, j--) {
			b[j] = a[i];
		}
		
		return b;
	}
	
	// *2)Delete specific element from an array
	
	public static int[] removeNumber(int[] a, int num) {
		int n = a.length;
		int[] remov = new int[n];
		
		for (int i = 0; i < n; i++) {
			remov[i] = a[i];
		}
		
		for (int i = 0; i < n; i++) {
			if (remov[i]==num) {
				for (int j = i; j < n - 1; j++) {
					remov[j]=remov[j+1];
				}
				remov[n -1] = 0;
				n--;
			}
		}
		
		remov = Arrays.copyOfRange(remov, 0, n - 1);
		return remov;

	}
	
	// *3)Find all the even numbers and put it in a new array and also find all odd numbers and put it in another array
	
	public static int[] oddNumbers(int[] a) {
		int n = a.length;
		int[] odds = new int[n];
		
		int j = 1;
		
		for (int i = 0; i < a.length; i++) {
			if (a[i]%2 != 0) {
				odds[j] = odds[j - 1];
				odds[j - 1] = a[i];
				j++;
			}
		}
		
		odds = Arrays.copyOfRange(odds, 0, j - 1);
		return odds;
		
	}
	
	public static int[] evenNumbers(int[] a) {
		int n = a.length;
		int[] evens = new int[n];
		
		int j = 1;
		
		for (int i = 0; i < a.length; i++) {
			if (a[i]%2 == 0) {
				evens[j] = evens[j - 1];
				evens[j - 1] = a[i];
				j++;
			}
		}
		
		evens = Arrays.copyOfRange(evens, 0, j - 1);
		return evens;
		
	}
	
	
	// *4)Find the sum of all even and odd numbers seperately and print the max out of it.(max of sum of even vs odd)
	
	public static int sumNumbers(int[] a) {
		int sum = 0;
		for(int x:a) {
			sum += x;
		}
		
		return sum;
	}
	
	
	// *5)Find the minimum and the maximum element in an array
	
	public static int minNumber(int[] a) {
		int min = a[0];
		for(int x: a) {
			if (x < min) {
				min = x;
			}
		}
		
		return min;
	}
	
	public static int maxNumber(int[] a) {
		int max = a[0];
		for(int x: a) {
			if (x > max) {
				max = x;
			}
		}
		
		return max;
	}
	
	// *6)Find all Palindrome numbers in an array
	
	public static boolean isPalindrome(int value) {
		boolean result = true;
		
		int n = String.valueOf(value).length();
		int[] numArray = new int[n];
		
		for (int i = 0; i < n; i++) {
			numArray[i] = value%10;
			value = (int) value/10;
			
		}
		for (int i = 0, j=n-1; i < n; i++, j--) {
			if (numArray[j]!=numArray[i]) {
				result = false;
				break;
			}
		}
		
		return result;
		
	}
	
	public static int[] palindromeNumbers(int[] a) {
		int[] pals = new int[a.length];
		int j = 1;
		for (int i = 0; i < a.length; i++) {
			if (isPalindrome(a[i])) {
				pals[j] = pals[j - 1];
				pals[j - 1] = a[i];
				j++;
			}
		}
		
		pals = Arrays.copyOfRange(pals, 0, j - 1);

		return pals;
	}
	
	//Task - Try the same stuff (autoboxing) with Long, Double and Float
	
	public static void longAutobox() {
		Long l1=113654823695465L;
		Long l2=113654823695465L;
		Long l3=new Long(113654823695465L);
		System.out.println("l1 = "+l1);
		System.out.println("l2 = "+l2);
		System.out.println("l3 = "+l3);
		System.out.println("l1==l2 "+(l1==l2));
		System.out.println("l1==l3 "+(l1==l3));
		
		System.out.println("l1.equals(l2)) "+(l1.equals(l2)));
		System.out.println("l1.equals(l3)) "+(l1.equals(l3)));
		
		long x=l1; //Autoboxing
		System.out.println("x = "+x);
		x=536254856965425L;
		l1=x;
		System.out.println("l1 = "+l1);
		
		System.out.println("Max long-type value: "+ Long.MAX_VALUE);
		System.out.println("Min long-type value: "+ Long.MIN_VALUE);
		
		//Java reads everything as String and Java writes everything as String
		String s="12658964585";
		long someNumber=Long.parseLong(s); //similar method in all other Wrapper classes except Character. 
		System.out.println("someNumber = "+ someNumber);
		
		someNumber=3654859653256L;
		s=someNumber+"";
		System.out.println("s = "+s);
		Long l5=536254856965425L;
		s=l5.toString();
		System.out.println("s = "+s);
		
		System.out.println(Long.toBinaryString(113654823695465L));
		System.out.println(Long.toHexString(113654823695465L));
		System.out.println(Long.toOctalString(113654823695465L));
		
		//compareTo - if 1st object is greater then the 2nd it will return +1 if it is same it will return 0 else -1
		System.out.println("l5 = "+l5);
		System.out.println("l5.compareTo(536254856965425L) "+l5.compareTo(536254856965425L));
		System.out.println("l5.compareTo(5536254856965425L) "+l5.compareTo(5536254856965425L));
		System.out.println("l5.compareTo(36254856965425L) "+l5.compareTo(36254856965425L));
		

	}
	
	public static void doubleAutobox() {
		Double d1=1256.3656986523;
		Double d2=1256.3656986523;
		Double d3=new Double(1256.3656986523);
		System.out.println("d1 = "+d1);
		System.out.println("d2 = "+d2);
		System.out.println("d3 = "+d3);
		System.out.println("d1==d2 "+(d1==d2));
		System.out.println("d1==d3 "+(d1==d3));
		
		System.out.println("d1.equals(d2)) "+(d1.equals(d2)));
		System.out.println("d1.equals(d3)) "+(d1.equals(d3)));
		
		double x = d1; //Autoboxing
		System.out.println("x = " + x);
		x=869546.3265895648;
		d1=x;
		System.out.println("d1 = "+d1);
		
		System.out.println("Max double-type value: "+ Double.MAX_VALUE);
		System.out.println("Min double-type value: "+ Double.MIN_VALUE);
		
		//Java reads everything as String and Java writes everything as String
		String s="869546.365932584";
		double someNumber=Double.parseDouble(s); //similar method in all other Wrapper classes except Character. 
		System.out.println("someNumber = "+ someNumber);
		
		someNumber=2365.3256891;
		s=someNumber+"";
		System.out.println("s = "+s);
		Double d5=869546.3265895648;
		s=d5.toString();
		System.out.println("s = "+s);
		
		//System.out.println(Double.toBinaryString(1256.3656986523));
		System.out.println(Double.toHexString(1256.3656986523));
		//System.out.println(Double.toOctalString(1256.3656986523));
		
		//compareTo - if 1st object is greater then the 2nd it will return +1 if it is same it will return 0 else -1
		System.out.println("d5 = "+d5);
		System.out.println("d5.compareTo(869546.3265895648) " + d5.compareTo(869546.3265895648));
		System.out.println("d5.compareTo(8869546.3265895648) " + d5.compareTo(8869546.3265895648));
		System.out.println("d5.compareTo(69546.3265895648) " + d5.compareTo(69546.3265895648));
		

	}
	
	public static void floatAutobox() {
		Float f1=1256.3656986523f;
		Float f2=1256.3656986523f;
		Float f3=new Float(1256.3656986523f);
		System.out.println("f1 = "+f1);
		System.out.println("f2 = "+f2);
		System.out.println("f3 = "+f3);
		System.out.println("f1==f2 "+(f1==f2));
		System.out.println("f1==f3 "+(f1==f3));
		
		System.out.println("f1.equals(f2)) "+(f1.equals(f2)));
		System.out.println("f1.equals(f3)) "+(f1.equals(f3)));
		
		float x = f1; //Autoboxing
		System.out.println("x = " + x);
		x=869546.3265895648f;
		f1=x;
		System.out.println("f1 = "+f1);
		
		System.out.println("Max float-type value: "+ Float.MAX_VALUE);
		System.out.println("Min float-type value: "+ Float.MIN_VALUE);
		
		//Java reads everything as String and Java writes everything as String
		String s="869546.365932584";
		float someNumber=Float.parseFloat(s); //similar method in all other Wrapper classes except Character. 
		System.out.println("someNumber = "+ someNumber);
		
		someNumber=2365.3256891f;
		s=someNumber+"";
		System.out.println("s = "+s);
		Float f5=869546.3265895648f;
		s=f5.toString();
		System.out.println("s = "+s);
		
		//System.out.println(Float.toBinaryString(1256.3656986523f));
		System.out.println(Float.toHexString(1256.3656986523f));
		//System.out.println(Float.toOctalString(1256.3656986523f));
		
		//compareTo - if 1st object is greater then the 2nd it will return +1 if it is same it will return 0 else -1
		System.out.println("f5 = "+f5);
		System.out.println("f5.compareTo(869546.3265895648f) " + f5.compareTo(869546.3265895648f));
		System.out.println("f5.compareTo(8869546.3265895648f) " + f5.compareTo(8869546.3265895648f));
		System.out.println("f5.compareTo(69546.3265895648f) " + f5.compareTo(69546.3265895648f));
		

	}
	
	
	//task1 - write a program to validate an SSN number using regex
	//task2 - write a program to validate DL 
	
	public static void ssnValidation(String n) {
		if(n.matches("[0-9]{2}-[0-9]{3}-[0-9]{4}")) {
			System.out.println(n + " is a valid SSN Number");
		}else {
			System.out.println(n + " is not a valid SSN Number");
		}
	}
	
	public static void dlValidation(String n) {
		if(n.matches("[0-9]{9}")) {
			System.out.println(n + " is a valid DL Number");
		}else {
			System.out.println(n + " is not a valid DL Number");
		}
	}
	
	// Task  - Print all palindromes between 1000 and 9999 with the above style
	
	
	public static void palindromeNewStyle() {
		for (int i = 1000; i < 10000; i++) {
			String s = i + "";
			if(new StringBuffer(s).reverse().toString().equals(s)) {
				System.out.println(s);
			}
		}
	}
	
	public static void capLastLetter(String s) {
		StringBuffer st=new StringBuffer();
		String ar[]=s.split(" ");
		for (int i = 0; i < ar.length; i++) {
			st.append(ar[i].substring(0,ar[i].length()-1)).append(Character.toUpperCase(ar[i].charAt(ar[i].length()-1))).append(" ");
		}
		System.out.println(st.toString().trim());
	}



}
