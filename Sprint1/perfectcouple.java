package saturday1910;
import java.util.*;

public class perfectcouple {
	
	    public List<String> checkPerfectCouple(Map<String, String> couples) {
	        List<String> perfectCouples = new ArrayList<>();

	        for (Map.Entry<String, String> entry : couples.entrySet()) {
	            String[] names = entry.getValue().split("-");
	            if (areAnagrams(names[0], names[1])) {
	                perfectCouples.add(entry.getKey());
	            }
	        }

	        return perfectCouples;
	    }

	    private boolean areAnagrams(String s1, String s2) {
	        char[] charArray1 = s1.toCharArray();
	        char[] charArray2 = s2.toCharArray();
	        Arrays.sort(charArray1);
	        Arrays.sort(charArray2);
	        return Arrays.equals(charArray1, charArray2);
	    }

	    public static void main(String[] args) {
	        Map<String, String> couples = new HashMap<>();
	        couples.put("ID1", "VIMAL-MALIV");
	        couples.put("ID2", "PUJA-PAJU");
	        couples.put("ID3", "ANIL-NILA");
	        perfectcouple checker = new perfectcouple();
	        List<String> perfectCouples = checker.checkPerfectCouple(couples);

	        System.out.println("Perfect Couples IDs:");
	        perfectCouples.forEach(System.out::println);
	}
}

