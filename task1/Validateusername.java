package Programs;

public class Validateusername {
	public boolean Validateusername(String username) {
		
		String str="_job";
		
		if(username.endsWith(str)) {
			String first=username.substring(0,username.length()-str.length());
			return first.length()>=8;
		
		}
		return false;
		
	}
	public static void main(String[] args) {
		Validateusername abc=new Validateusername();
		System.out.println(abc.Validateusername("deshakyadav_job"));
		
	}

		
	

}
