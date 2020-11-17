package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();

        students.add("Matt");
        students.add("Mo");
        students.add("Danny");

        Set<String> getStudents = new HashSet<>(students);
        Map<String, Integer> mapStudent = getStudents.stream().collect(Collectors.toMap(x -> x,x -> 0));
        Collections.sort(students);

        System.out.println("List output of students: " + students);
        System.out.println("Set output of students: " + getStudents);
        System.out.println("Map output of students: " + mapStudent);
    }
}
