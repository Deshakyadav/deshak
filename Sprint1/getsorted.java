package Tuesday1510;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class getsorted {

    public int[] getSorted(int[] arr) {
        List<Integer> reversedNumbers = new ArrayList<>();

        for (int num : arr) {
            String reversedStr = new StringBuilder(String.valueOf(num)).reverse().toString();
            int reversedNum = Integer.parseInt(reversedStr);
            reversedNumbers.add(reversedNum);
        }
        Collections.sort(reversedNumbers);
        int[] result = new int[reversedNumbers.size()];
        for (int i = 0; i < reversedNumbers.size(); i++) {
            result[i] = reversedNumbers.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        getsorted sorter = new getsorted();
        int[] inputArray = {22,54,1,5,76};

        System.out.println("Original array:");
        for (int num : inputArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        int[] sortedArray = sorter.getSorted(inputArray);
        System.out.println("Sorted array after reversing numbers:");
        for (int num : sortedArray) {
            System.out.print(num + " ");
        }
    }
}
