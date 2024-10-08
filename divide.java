package numberprograms;

public class divide {
	
	    public static void main(String[] args) {
	        int n = 10; // You can change this value to any 'n'
	       // int sum = calculateSum(n);
	        System.out.println(calculateSum(n));
	    }

	    public static int calculateSum(int n) {
	        int sum = 0;
	        for (int i = 1; i <= n; i++) {
	            if (i% 3 == 0 || i % 5 == 0) {
	                sum =sum+i;
	            }
	        }
	        return sum;
	    }
	}

