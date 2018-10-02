package com.interview.datastructure.Lists;

import java.util.LinkedList;

public class LinkedListAsQueueAndStack {
    public static void main(String args[]){

        //LinkedList is already a queue;
        //Since it implements the queue interface.
        //Refer Java Docs :https://docs.oracle.com/javase/7/docs/api/java/util/LinkedList.html
        LinkedList<Integer> queue = new LinkedList<>();
        //Enqueue: Appends the specified element to the end of this list
        for(int i=0;i<100;i++){
            queue.add(i);
        }
        //Dequeue: Retrieves and removes the head (first element) of this list
        System.out.println(queue.remove());
        System.out.println(queue.remove());

        // It is also very easy to use a LinkedList as stack,since it
        // has a method removeLast()

        LinkedList<Integer> stack = new LinkedList<>();
        //Push: Appends the specified element to the end of this list.
        // Pop: removes and returns the last element of this list.
        for (int j=0;j<100;j++){
            stack.add(j);
        }
        System.out.println(stack.removeLast());






        
    }
}
