package Tuesday1510;
import java.util.HashMap;
import java.util.Map;
public class countcharacters {
	    public Map<Character, Integer> countCharacter(char[] array) {
	        Map<Character, Integer> charCountMap = new HashMap<>();

	        for (char c : array) {
	            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
	        }

	        return charCountMap;
	    }

	    public static void main(String[] args) {
	    	countcharacters counter = new countcharacters();
	        char[] inputArray = {'A', 'P', 'P', 'L', 'E'};
	        
	        Map<Character, Integer> result = counter.countCharacter(inputArray);

	        System.out.println("Character count map:");
	        for (Map.Entry<Character, Integer> entry : result.entrySet()) {
	            System.out.println(entry.getKey() + ": " + entry.getValue());
	        }
	    }
	}



