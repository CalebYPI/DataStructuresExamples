package org.example;

import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class AppTest {

    ArrayList<String> students = new ArrayList<>();
    @Before
    public void setUp(){
        students.add("Student1");
        students.add("Student2");
        students.add("Student3");
    }

    @Test
    public void runDataSets() {
        Set<String> getStudents = new HashSet<>(students);
        Map<String, Integer> mapStudent = getStudents.stream().collect(Collectors.toMap(x -> x, x -> 0));
        Collections.sort(students);

        Assert.assertNotNull(getStudents);
        Assert.assertNotNull(mapStudent);
        Assert.assertNotSame(getStudents, mapStudent);
    }
}