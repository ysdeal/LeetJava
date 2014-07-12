/*
Given a linked list, reverse the nodes of a linked list k at a time and return its modified list.

If the number of nodes is not a multiple of k then left-out nodes in the end should remain as it is.

You may not alter the values in the nodes, only nodes itself may be changed.

Only constant memory is allowed.

For example,
Given this linked list: 1->2->3->4->5

For k = 2, you should return: 2->1->4->3->5

For k = 3, you should return: 3->2->1->4->5 
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

public class reverseKGroup{
    public static void main(String[] args) {
    	ListNode head = new ListNode(0);
    	head.next = new ListNode(1);
    	head.next.next = new ListNode(2);
    	head.next.next.next = new ListNode(3);
    	ListNode rg = reverseK(head,2);
    	while(rg != null){
    		System.out.println(rg.val);
    		rg= rg.next;
    	}
    }
    public static ListNode reverseK(ListNode head, int k){
    	if(k == 1 || k == 0)
    		return head;
    	ListNode pre = new ListNode(0);
    	pre.next = head;
    	ListNode dump = pre;
    	int count = 0;
    	while(head != null){
    		count ++;
    		if(count%k == 0){
    			ListNode tail = head.next;
    			head = pre.next;
    			ListNode pn = head.next;
    			while(pn != tail){
    				head.next = pn.next;
    				pn.next = pre.next;
    				pre.next = pn;
    				pn = head.next;
    			}
    			pre = head;
    		}
    		head = head.next;
    	}
    	return dump.next;
    }
}