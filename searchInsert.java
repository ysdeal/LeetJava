/*
Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You may assume no duplicates in the array.

Here are few examples.
[1,3,5,6], 5 - 2
[1,3,5,6], 2 - 1
[1,3,5,6], 7 - 4
[1,3,5,6], 0 - 0
*/
import java.util.*;
public class searchInsert{
	public static void main(String[] args) {
		int[] A = {1,3,5,6};
		System.out.println(searchInsert(A,7));
	}
	public static int searchInsert(int[] A, int target){
		int res = 0;
		if(A == null)
			return res;
		for(int i = 0; i < A.length; ++i){
			if(A[i] == target)
				return i;
			if(A[i] < target)
				res = i+1;
		}
		return res;
	}
} 