package numberprograms;

public class powernumber {
	static boolean checknumber (int n) {
		while(n>2 && n%2==0) {
			n=n/2;
		}
		if(n==2) {
			return true;
		}
		else {
			return false;
		}
	

}
public static void main(String[] args) {
	System.out.println(checknumber(8));
}
}