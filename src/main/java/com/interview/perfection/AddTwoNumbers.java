package com.interview.perfection;

import java.util.LinkedList;

class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val=val;
    }
}

public class AddTwoNumbers {
    public static void main(String args[]){
        ListNode l1 = new ListNode(9);
        l1.next= new ListNode(9);

        ListNode l2 = new ListNode(9);
        l2.next = new ListNode(9);

        ListNode  head = new ListNode(0);
        ListNode cur = head;
        int carry=0;

        while (l1!=null || l2!=null){
            int p = (l1!=null) ? l1.val:0;
            int q = (l2!=null) ? l2.val:0;
            int sum = p+q+carry;
            carry = sum/10;
            cur.next = new ListNode(sum%10);
            cur = cur.next;
            if(l1!=null) l1 = l1.next;
            if(l2!=null) l2 =l2.next;
        }
        if(carry>0){
            cur.next = new ListNode(carry);
        }
        ListNode temp = head.next;
        while (temp!=null){
            System.out.println(temp.val);
            temp=temp.next;
        }







    }

}
