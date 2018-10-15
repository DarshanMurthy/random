package com.interview.java_related.comparator_examples;

import java.util.*;


class Student1{
    int roll_number;

    public Student1(int roll_number) {
        this.roll_number = roll_number;
    }
}

 class Stu  implements Comparator<Student1> {
    @Override
    public int compare(Student1 o1, Student1 o2) {
        return o1.roll_number - o2.roll_number;
    }
}
    public class Example1{

    public  static  void  main(String[] args){
        List<Student1> list = new LinkedList<>();
        list.add(new Student1(3));
        list.add(new Student1(2));
        Collections.sort(list, new Stu());
        for(Student1 i: list ){
            System.out.println(i.roll_number);
        }



//        Stack<Integer> stack = new Stack<>();
//        for(int i=0;i< 100;i++) stack.push(i);
//        while (!stack.isEmpty()){
//            System.out.println(stack.pop());
//        }
        //assert stack.toArray().equals(arr);
    }
}

