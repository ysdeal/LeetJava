/*
Given a sorted array of integers, find the starting and ending position of a given target value.

Your algorithm's runtime complexity must be in the order of O(log n).

If the target is not found in the array, return [-1, -1].

For example,
Given [5, 7, 7, 8, 8, 10] and target value 8,
return [3, 4]. 
*/
import java.util.*;
public class searchRange{
	public static void main(String[] args) {
		int[] A = {5, 7, 7, 8, 8, 10};
		int[] res = searchRange(A,8);
		System.out.println(res[1]);
	}
	public static int[] searchRange(int[] A, int target){
		int[] res = {-1,-1};
		int st = 0;
		int ed = A.length;
		while(st < ed){
			int m = (ed - st)/2 + st;
			if(A[m] < target)
				st = m + 1;
			else
				ed = m;
		}
		if(st >= A.length || A[st] != target) return res;
		res[0] = st;
		ed = A.length;
		while(st < ed){
			int m = (ed - st)/2 + st;
			if(A[m] > target)
               ed = m;
           else
           	   st = m + 1;
		}
		res[1] = ed-1;
		return res;
	}
}