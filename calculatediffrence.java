package numberprograms;

public class calculatediffrence {
	public class SumSquareDifference {

	 
	    public static int calculateDifference(int n) {
	        int sumOfSquares = 0;
	        int squareOfSum = 0;


	        for (int i = 1; i <= n; i++) {
	            sumOfSquares += i * i;
	        }

	       
	        int sum = 0;
	        for (int i = 1; i <= n; i++) {
	            sum += i;
	        }

	        squareOfSum = sum * sum;

	        return squareOfSum - sumOfSquares;
	    }

	    public static void main(String[] args) {
	        int n = 5;
	        int difference = calculateDifference(n);
	        System.out.println("The difference between the square of the sum and the sum of squares for the first " + n + " natural numbers is: " + difference);
	    }
	}

}



	