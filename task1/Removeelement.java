package Programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Removeelement {
	private static String[] elements1;

	public List<String>removeElements(List<String>List1,List<String>List2){
		List1.retainAll(List2);
		return new ArrayList<>(List1);
	}
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		List<String>list1=new ArrayList<>();
		List<String>list2=new ArrayList<>();
		
		
		
		System.out.println("Element for list1():");
		String[]elements1=scan.nextLine().split(",");
		for(String elem:elements1) {
			list1.add(elem.trim());
		}
		System.out.println("Element for list2():");
		String[]elements2=scan.nextLine().split(",");
		for(String elem:elements2) {
			list1.add(elem.trim());
		}
		Removeelement modifier=new Removeelement();
		
		List<String>result=modifier.removeElements(list1,list2);
		
		System.out.println("Resulting list after retaining elements from list2");
		for (String elem:result) {
			System.out.println(elem+"elements are result");
		
		}
		
		scan.close();
		}
		
		
	}


