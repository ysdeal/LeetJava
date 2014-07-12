/*
Given a linked list, swap every two adjacent nodes and return its head.

For example,
Given 1->2->3->4, you should return the list as 2->1->4->3.

Your algorithm should use only constant space. You may not modify the values in the list, only nodes itself can be changed. 
*/

import java.util.*;
class ListNode{
	int val;
	ListNode next;
	ListNode (int x){
		val = x;
		next = null;
	}
}

public class swapPairs{
    public static void main(String[] args) {
    	ListNode head = new ListNode(0);
    	head.next = new ListNode(1);
    	head.next.next = new ListNode(2);
    	//head.next.next.next = new ListNode(3);
    	ListNode rg = swapP(head);
    	while(rg != null){
    		System.out.println(rg.val);
    		rg= rg.next;
    	}
    }
    public static ListNode swapP(ListNode head){
    	ListNode dump = new ListNode(0);
    	dump.next = head;
    	ListNode pre = dump;
    	ListNode p = head;
    	while(p != null && p.next != null){
    		pre.next = p.next;
            p.next = p.next.next;
            pre.next.next = p;
            pre = p;
            p = p.next;
    	}
    	return dump.next;
    }
}
