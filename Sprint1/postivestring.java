package saturday1910;

public class postivestring {
	    public boolean checkPositive(String str) {
	        char[] charArray = str.toCharArray();
	        for (int i = 0; i < charArray.length - 1; i++) {
	            if (charArray[i] > charArray[i + 1]) {
	                return false;
	            }
	        }

	        return true;
	    }
	    public static void main(String[] args) {
	    	postivestring checker = new postivestring();
	        System.out.println("ANT: " + checker.checkPositive("ANT"));
	        System.out.println("ABCA: " + checker.checkPositive("ABCA")); 
	    }
	}



