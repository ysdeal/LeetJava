/*
 Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.

Do not allocate extra space for another array, you must do this in place with constant memory.

For example,
Given input array A = [1,1,2],

Your function should return length = 2, and A is now [1,2]. 
*/
import java.util.*;
public class removeDuplicatesFromSortedArray{
	public static void main(String[] args) {
		int[] A = {1,1,1,1,2,3,3,3};
		int l = removeDuplcates(A);
		System.out.println(l);
	}
	public static int removeDuplcates(int[] A){
		if(A.length == 0)
			return 0;

		int l = 0;
		for(int i = 1; i < A.length; ++i){
			if(A[i] != A[l])
				A[++l] = A[i];
		}
		return l + 1;
	}
}