package numberprograms;

public class StringMirror {
	

	    public String getImage(String input) {
	        StringBuffer sb = new StringBuffer(input);
	        String reversed = sb.reverse().toString();
	        return input + " | " + reversed;
	    }

	    public static void main(String[] args) {
	        StringMirror sm = new StringMirror();
	        System.out.println(sm.getImage("Earth")); 
	    }
	}



