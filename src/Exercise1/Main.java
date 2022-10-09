package Exercise1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> studentAndGrades = new HashMap<>();
        studentAndGrades.put("Mihai", 10);
        studentAndGrades.put("Anda", 8);
        studentAndGrades.put("Cristina", 9);
        studentAndGrades.put("Crina", 5);


        //printam toti studentii si notele lor
        System.out.println(studentAndGrades.entrySet());

       //System.out.println(entry.getKey() + " " + entry.getValue());
        //Student with maxGrade
        Integer maxGrade = 0;
        String nameSudent = null;
        Set<Map.Entry<String, Integer>> entries = studentAndGrades.entrySet();
        if (entries.isEmpty()) {
            System.out.println("Nu avem niciun student in clasa");
        } else {
            for (Map.Entry<String, Integer> entry : entries) {
                if (entry.getValue() > maxGrade) {
                    maxGrade = entry.getValue();
                    nameSudent = entry.getKey();
                }
            }
            System.out.println(String.format("%s are nota maxima %d", nameSudent, maxGrade));
        }
    }
}
