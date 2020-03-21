package fi.tuni;

public class SolutionArrayManipulation {

	static long arrayManipulation(int n, int[][] queries) {

		if (n <= 3) {
			
			return 0;
		}
		
		long sum = 0;
		int[] ar = new int[n + 1];

		for (int[] tmp : queries) {

			ar[tmp[0]] = ar[tmp[0]] + tmp[2];
			
			if (tmp[1] + 1 <= n) {
				
				ar[tmp[1] + 1] = ar[tmp[1] + 1] - tmp[2];
			}
		}

        long x = 0;
        for (int k = 1; k < ar.length ; k++) {
            
            x =  x + ar[k];
            if(sum <  x) {
                sum = x;
            }
        }
		
		return (sum);
	}

	public static void main(String[] args) {

		int[][] test = {{1,2,100},{2,5,100},{3,4,100}};
		
		System.out.println(SolutionArrayManipulation.arrayManipulation(5, test));

	}
}
