package assign2;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] g= {56,17,34,87,737,27,22};
		
		System.out.println("Original Vector");
		System.out.println(Arrays.toString(g));
		
		int[] hReverse= ArraysTasks.reverseOrder(g);
		
		System.out.println("\nVector in reverse order");
		for(int x:hReverse) {
			System.out.print(x + " ");
		};
		
		int numRemov = 87;
		System.out.println("\n\nVector after removed a number " + numRemov);
		int[] remov = ArraysTasks.removeNumber(g, numRemov);
		
		System.out.println(Arrays.toString(remov));
		
		int[] hOdds = ArraysTasks.oddNumbers(g);
		
		System.out.println("\n\nVector of Odds numbers");
		//System.out.println(Arrays.toString(hOdds));
		for(int x:hOdds) {
			System.out.print(x + " ");
		};
		
		int[] hEvens = ArraysTasks.evenNumbers(g);
		
		System.out.println("\n\nVector of Evens numbers");
		System.out.println(Arrays.toString(hEvens));
		
		int sumOdds = ArraysTasks.sumNumbers(hOdds);
		int sumEvens = ArraysTasks.sumNumbers(hEvens);
		
		if (sumOdds > sumEvens) {
			System.out.println("\nThe higher sum is in Odd vector: " + sumOdds);
		} else {
			System.out.println("\nThe higher sum is in Even vector: " + sumEvens);
		}
		
		int minOdds = ArraysTasks.minNumber(hOdds);
		int maxOdds = ArraysTasks.maxNumber(hOdds);
		
		System.out.println("\nThe minimum value in Odd vector: " + minOdds);
		System.out.println("\nThe maximum value in Odd vector: " + maxOdds);
		
		int minEvens = ArraysTasks.minNumber(hEvens);
		int maxEvens = ArraysTasks.maxNumber(hEvens);
		
		System.out.println("\nThe minimum value in Even vector: " + minEvens);
		System.out.println("\nThe maximum value in Even vector: " + maxEvens);
		
		int[] palindromes = ArraysTasks.palindromeNumbers(g);
		
		System.out.println("\n\nVector of Palindrome numbers");
		if (palindromes.length==0) System.out.println("There is not palindrome numbers");
		System.out.println(Arrays.toString(palindromes));
		
		System.out.println("\nAutoboxing for long numbers, (Wrapper)");
		ArraysTasks.longAutobox();
		
		System.out.println("\nAutoboxing for double numbers, (Wrapper)");
		ArraysTasks.doubleAutobox();
		
		System.out.println("\nAutoboxing for float numbers, (Wrapper)");
		ArraysTasks.floatAutobox();
		
		System.out.println("\nSocial security number validation");
		String ssn = "85-634-8549";
		ArraysTasks.ssnValidation(ssn);
		
		System.out.println("\nDriver License number validation");
		String dl = "1246932";
		ArraysTasks.ssnValidation(dl);
		
		System.out.println("\nPrinting palindrome between 1000-9999 using BufferString class");
		ArraysTasks.palindromeNewStyle();

	}

}
