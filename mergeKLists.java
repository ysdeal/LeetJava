/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
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

public class mergeKLists{
	public static void main(String[] args) {
		ListNode l1 = new ListNode(5);
		l1.next = new ListNode(9);
		ListNode l2 = new ListNode(6);
		l2.next = new ListNode(7);
		ArrayList<ListNode> lists = new ArrayList<ListNode>(Arrays.asList(l1,l2));
		ListNode res = mergeK(lists);
		while (res != null){
			System.out.print(res.val + "->");
			res = res.next;
		}
		return;
	}

	public static ListNode mergeK(ArrayList<ListNode> lists){
		if (lists.size() == 0)
			return null;
		//PriorityQueue 
		PriorityQueue<ListNode> heap = new PriorityQueue<ListNode>(lists.size(), new Comparator<ListNode>(){
			@Override
			public int compare(ListNode a, ListNode b){
				return a.val - b.val;
			}
		});

		for(ListNode l : lists){
			if (l != null)
				heap.add(l);
		}
        
        ListNode head = new ListNode(0);
        ListNode cur = head;
        while(heap.size() > 0){
        	ListNode tp = heap.poll();
        	cur.next = tp;
        	if(tp.next != null)
        		heap.add(tp.next);
        	cur = cur.next;
        }
        return head.next;
	} 
}
