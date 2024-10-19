package saturday1910;

public class findsum {

	    public static int findSum(int number) {
	        int sum = 0;
	        while (number != 0) {
	            int digit = number % 10;  
	            sum += digit * digit * digit;  
	            number /= 10; 
	        }
	        return sum;
	    }
	    public static void main(String[] args) {
	        int number = 123;  
	        int result = findSum(number);
	        System.out.println("Sum of the cubes of the digits: " + result);
	    }
	}

