/*
You are given two linked lists representing two non-negative numbers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
*/

import java.util.*;
class ListNode{
	int val;
	ListNode next;
	ListNode(int x){
		val = x;
		next = null;
	}
}

public class addTwoNumber{
	public static void main(String[] args) {
		ListNode l1 = new ListNode(5);
		l1.next = new ListNode(3);
		ListNode l2 = new ListNode(6);
		l2.next = new ListNode(7);
		ListNode res = addTwoNumbers(l1,l2);
		while (res != null){
			System.out.print(res.val + "->");
			res = res.next;
		}

	}
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dump = new ListNode(0);
        ListNode tp = dump;
        int val = 0;
        while(l1!=null || l2!=null || val != 0){
            if(l1!=null){
                val += l1.val;
                l1 = l1.next;
            }
            if(l2!=null){
                val += l2.val;
                l2 = l2.next;
            }
            tp.next = new ListNode(val%10);
            val /= 10;
            tp = tp.next;
        }
        return dump.next;
    }
}