package saturday1910;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;


public class getvalues {
	    public List<Integer> getValues(HashMap<Integer, Integer> map) {
	        List<Integer> values = new ArrayList<>(map.values());
	        Collections.sort(values);
	        return values;
	    }
	    public static void main(String[] args) {
	        HashMap<Integer, Integer> map = new HashMap<>();
	        map.put(1, 34);
	        map.put(2, 12);
	        map.put(3, 78);
	        map.put(4, 56);

	        getvalues sorter = new getvalues();
	        List<Integer> sortedValues = sorter.getValues(map);

	        System.out.println("Sorted values: " + sortedValues);
	    }
	}

	

