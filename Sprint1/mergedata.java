package saturday1910;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class mergedata {
 char[] mergeData(List<Character> list1, List<Character> list2) {
	        List<Character> mergedList = new ArrayList<>(list1);
	        mergedList.addAll(list2); 
	        Collections.sort(mergedList); 
	        char[] result = new char[mergedList.size()];
	        for (int i = 0; i < mergedList.size(); i++) {
	            result[i] = mergedList.get(i);
	        }
	        return result;
	    }
	    public static void main(String[] args) {
	        List<Character> list1 = new ArrayList<>();
	        List<Character> list2 = new ArrayList<>();
	        Collections.addAll(list1, 'a', 'c', 'e');
	        Collections.addAll(list2, 'b', 'd', 'f');        
	        mergedata merger = new mergedata();
	        char[] result = merger.mergeData(list1, list2);
	        
	        System.out.println("Merged and sorted array:");
	        for (char c : result) {
	            System.out.print(c + " ");
	        }
	    }
	}