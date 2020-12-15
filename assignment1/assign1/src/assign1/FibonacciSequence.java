package assign1;

public class FibonacciSequence {
	
	public static void fibonacciSeq(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			if (i==0) {
				a[0]=1;
			} else if (i==1) {
				a[1]=1;
			} else {
				a[i] = a[i-1] + a[i-2];
			}
			
			
			System.out.print(a[i] + " ");
			
		}
	}

}
