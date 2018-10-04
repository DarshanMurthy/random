package com.interview.datastructure.Lists;

public class ListImplementation {
    public static void main(String args[]){
        Node head = new Node(0);
        Node one = new Node(10);
        Node two = new Node(20);
        head.next = one;
        one.next = two;

        // Traverse
        Node cur = head.next;
        while (cur!=null) {
            System.out.println(cur.data);
            cur = cur.next;
        }

    }
}
