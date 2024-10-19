package wednesday1610;
import java.util.HashMap;
import java.util.Map;
public class Statecaptails {
	    public Map<String, String> getStates(String data, String del1, String del2) {
	        Map<String, String> stateCapitalMap = new HashMap<>();
	        for (String pair : data.split(del2)) {
	            String[] stateCapital = pair.split(del1);
	            if (stateCapital.length == 2) {
	                stateCapitalMap.put(stateCapital[0], stateCapital[1]);
	            }
	        }
	        return stateCapitalMap;
	    }
	    public static void main(String[] args) {
	    	Statecaptails parser = new Statecaptails();
	        String data = "tamilnadu||chennai-karanataka||bengaluru";
	        String del1 = "\\|\\|";
	        String del2 = "-";
	        Map<String, String> result = parser.getStates(data, del1, del2);

	        System.out.println("State-Capital Map:");
	        for (Map.Entry<String, String> entry : result.entrySet()) {
	            System.out.println(entry.getKey() + " --> " + entry.getValue());
	        }
	    }
	}


