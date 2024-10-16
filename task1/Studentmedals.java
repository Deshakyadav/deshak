package Programs;
import java.util.HashMap;

import java.util.Scanner;

public class Studentmedals {
    
    public HashMap<Integer, String> getStudents(HashMap<Integer, Integer> studentMarks) {
        HashMap<Integer, String> studentMedals = new HashMap<>();
        
        for (Integer regNum : studentMarks.keySet()) {
            int marks = studentMarks.get(regNum);
            
            if (marks >= 90) {
                studentMedals.put(regNum, "Gold");
            } else if (marks >= 80 && marks < 90) {
                studentMedals.put(regNum, "Silver");
            } else if (marks >= 70 && marks < 80) {
                studentMedals.put(regNum, "Bronze");
            }
        }
        
        return studentMedals;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, Integer> studentMarks = new HashMap<>();
        
        System.out.println("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter registration number: ");
            int regNum = scanner.nextInt();
            System.out.println("Enter marks: ");
            int marks = scanner.nextInt();
            studentMarks.put(regNum, marks);
        }
        
        Studentmedals awards = new Studentmedals();
        HashMap<Integer, String> result = awards.getStudents(studentMarks);
        
        System.out.println("Medal Awards: ");
        for (Integer regNum : result.keySet()) {
            System.out.println("Reg Num: " + regNum + ", Medal: " + result.get(regNum));
        }
        
        scanner.close();
    }
}

