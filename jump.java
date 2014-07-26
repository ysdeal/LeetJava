/*
 Given an array of non-negative integers, you are initially positioned at the first index of the array.

Each element in the array represents your maximum jump length at that position.

Your goal is to reach the last index in the minimum number of jumps.

For example:
Given array A = [2,3,1,1,4]

The minimum number of jumps to reach the last index is 2. (Jump 1 step from index 0 to 1, then 3 steps to the last index.) 
*/
import java.util.*;
public class jump{
	public static void main(String[] args) {
		int[] A = {2,3,1,1,4};
		System.out.println(jump2(A));
		System.out.println(jump(A));
	}

	// Jump II
	public static int jump2(int[] A){
		int last = 0;
		int cur = 0;
		int sp = 0;
		for(int i = 0; i < A.length; ++i){
			if(i > last){
				last = cur;
				sp ++;
			}
			cur = Math.max(cur, i + A[i]);
		}
		return sp;
	}

	public static boolean jump(int[] A){
		int cur  = 0;
		for(int i = 0; i < A.length; ++i){
			cur = Math.max(cur,i + A[i]);
			if(cur < i + 1)
				return false;
		}
		return true;
	}
}