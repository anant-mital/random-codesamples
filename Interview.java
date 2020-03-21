package fi.tuni;

import java.util.Arrays;

public class Interview {

	public static int[] revAraay(int[] ar) {

		// We can use a tmp to store the value of the last index
		// and replace with the value in the starting index
		// it will require a single loop

		// Two cases have to checked
		// Odd number of values and even number of values
		// For odd number of values the loop should run
		// k = (n-1)/2 and even n/2 (check this condition)
			
		
		// length of Array
		int n = ar.length;

		// Handle corner cases here

		if (n == 0) {

			return (ar);
		}

		if (n == 1) {

			return (ar);

		}

		// loop till
		int k = 0;

		if (n % 2 == 0) {

			k = n / 2;

		} else {

			k = (n - 1) / 2;
		}
		
		int tmp = 0;
		for (int i = 0; i < k; i++) {

			tmp = ar[i];
			ar[i] = ar[(n-1)-i];
			ar[(n-1) - i] = tmp;

		}

		return (ar);

	}

	public static void main(String[] args) {

		int[] test = { 1, 2, 3, 4, 5, 6, 7, 8 };
		System.out.println(Arrays.toString(Interview.revAraay(test)));

	}
	
	public static int test(int n) {
		
		return n;
	}

}
