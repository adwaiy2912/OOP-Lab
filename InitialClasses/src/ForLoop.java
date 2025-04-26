// Program to find the sum of natural numbers from 1 to 10.

public class ForLoop {

	public static void main(String[] args) {
		int sum = 0;
	    int n = 10;

	    // for loop
	    for (int i = 1; i <= n; ++i) {
	      // body inside for loop
	      sum += i;     // sum = sum + i
	    }
	       
	    System.out.println("Sum = " + sum);
	}

}
