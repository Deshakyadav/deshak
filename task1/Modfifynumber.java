package Programs;

public class Modfifynumber {
	

	    public int modifyNumber(int number1) {
	        String numberStr = String.valueOf(number1);
	        StringBuffer modifiedNumber = new StringBuffer();
	        
	        for (int i = 0; i < numberStr.length() - 1; i++) {
	            int digit1 = Character.getNumericValue(numberStr.charAt(i));
	            int digit2 = Character.getNumericValue(numberStr.charAt(i + 1));
	            int diff = Math.abs(digit1 - digit2);
	            modifiedNumber.append(diff);
	        }
	        
	      
	        modifiedNumber.append(numberStr.charAt(numberStr.length() - 1));
	        
	        return Integer.parseInt(modifiedNumber.toString());
	    }

	    public static void main(String[] args) {
	    	Modfifynumber nm = new Modfifynumber();
	        System.out.println(nm.modifyNumber(458));  
	    }
	}



