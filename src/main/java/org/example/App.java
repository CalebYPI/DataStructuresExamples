package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class App {

    private static ArrayList<String> students = new ArrayList<>();

    public static void main(String[] args) {

        students.add("Matt");
        students.add("Mo");
        students.add("Danny");

        runDataSets();
    }

    public static void runDataSets() {
        Set<String> getStudents = new HashSet<>(students);
        Map<String, Integer> mapStudent = getStudents.stream().collect(Collectors.toMap(x -> x,x -> 0));
        Collections.sort(students);
        System.out.println("List output of students: " + students);
        System.out.println("Set output of students: " + getStudents);
        System.out.println("Map output of students: " + mapStudent);
    }
}
