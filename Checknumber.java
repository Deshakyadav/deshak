package numberprograms;

public class Checknumber {
	

	    public static int calculateDifference(int n) {
	        int sumOfSquare = (n*(n+1)/2*n*(n+1)/2);
	        int sum = 0;

	        while (n>0) {
//	            int squareOfSum = n* n;
	            sum =sum+n*n;
	            n--;
	        }

	        int squareOfSum = sum * sum;
	        return sum - sumOfSquare;
	    }

	    public static void main(String[] args) {
	    
	        System.out.println(calculateDifference(10));  
	    }
	}



