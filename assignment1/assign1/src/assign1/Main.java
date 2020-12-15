package assign1;
import java.util.Scanner;
import assign1.OddInRange;
import assign1.FibonacciSequence;
import assign1.Palindrome;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("What do you wanna do?");
		System.out.println("=====================================");
		System.out.println("Generate odd number in a range ---> 1");
		System.out.println("Generate Fibonacci sequence ------> 2");
		System.out.println("Verify if a value is palindrome --> 3");
		System.out.println("\nSelect an option");
		
		Scanner option = new Scanner(System.in);
		int opt = option.nextInt();
		
		switch(opt) {
		case 1:
			System.out.println("Select initial and final values");
			int iniValue = option.nextInt();
			int finValue = option.nextInt();
			
			OddInRange.oddInRange(iniValue, finValue);
			
			break;
		case 2:
			System.out.println("Select the number of Fibonacci sequence");
			int num = option.nextInt();
			
			FibonacciSequence.fibonacciSeq(num);
			
			break;
		case 3:
			System.out.println("Select posible palindrome number");
			int p = option.nextInt();
			
			Palindrome.isPalindrome(p);
			
			break;
		default:
			System.out.println("Wrong selection");
				
		}
		

	}

}
