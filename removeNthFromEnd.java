/*
Given a linked list, remove the nth node from the end of list and return its head.

For example,

   Given linked list: 1->2->3->4->5, and n = 2.

   After removing the second node from the end, the linked list becomes 1->2->3->5.

Note:
Given n will always be valid.
Try to do this in one pass. 
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

public class removeNthFromEnd{
	public static void main(String[] args) {
		ListNode l1 = new ListNode(5);
		l1.next = new ListNode(9);
		l1.next.next = new ListNode(8);
		ListNode res = removeNthFromEnd(l1,2);
		while (res != null){
			System.out.print(res.val + "->");
			res = res.next;
		}
	}
	public static ListNode removeNthFromEnd(ListNode head, int n){
		if(head == null) return null;
		if(head.next == null && n == 1)
			return null;
		ListNode ph = head;
		ListNode p  = head;
		int count = 0;
		while(ph.next != null){
			if(count >= n)
				p = p.next;
			count ++;
			ph = ph.next;
		}	
		if(count < n)
			head = head.next;
		else
			p.next = p.next.next;
		return head;
	}
}