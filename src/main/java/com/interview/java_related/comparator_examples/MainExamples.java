package com.interview.java_related.comparator_examples;

import java.util.ArrayList;
import java.util.Collections;

class Student{
    int rollno;
    String name,address;
    public Student(int rollno, String name, String address){
        this.rollno = rollno;
        this.address = address;
    }
}

public class MainExamples {
    public static void main(String [] main){
        ArrayList<Student> ar = new ArrayList<>();
        ar.add(new Student(11, "tom","london1"));
        ar.add(new Student(12,"tim","london2"));

        for(int i=0;i< ar.size();i++){
            System.out.println(ar.get(i));
        }
        Collections.sort(ar, new);
    }
}
