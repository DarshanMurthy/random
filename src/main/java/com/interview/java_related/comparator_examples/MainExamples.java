package com.interview.java_related.comparator_examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student{
    int rollno;
    String name,address;
    public Student(int rollno, String name, String address){
        this.rollno = rollno;
        this.address = address;
        this.name = name;
    }
}

class Sortbyroll implements Comparator<Student>{
    public int compare(Student a, Student b){
        return  a.rollno-b.rollno;
    }

}

class Sortbyname implements Comparator<Student>{
    public int compare(Student a, Student b){
        return a.name.compareTo(b.name);
    }
}

public class MainExamples {
    public static void main(String [] main){
        ArrayList<Student> ar = new ArrayList<>();
        ar.add(new Student(14,"note","london3"));
        ar.add(new Student(11, "tom","london1"));
        ar.add(new Student(12,"tim","london2"));

        for(int i=0;i< ar.size();i++) {
            System.out.println(ar.get(i).name);
        }

        Collections.sort(ar,new Sortbyname());
        Collections.sort(ar,new Sortbyroll());

        for(int i=0;i< ar.size();i++) {
            System.out.println(ar.get(i).name);
        }
        System.out.println("darshan".compareTo("tumkur"));

    }
}
