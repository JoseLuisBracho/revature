package assign1;

public class Palindrome {
	
	public static void isPalindrome(int value) {
		boolean result = true;
		
		int n = String.valueOf(value).length();
		int[] numArray = new int[n];
		
		if (n%2!=0 || n==2) {
			for (int i = 0; i < n; i++) {
				numArray[i] = value%10;
				value = (int) value/10;
				//System.out.println("number: " +numArray[i]);
				
			}
			for (int i = 0, j=n-1; i < n; i++, j--) {
				if (numArray[j]!=numArray[i]) {
					result = false;
					break;
				}
			}
		};
		System.out.println("The value is palindrome: " + result);
		
	}

}
