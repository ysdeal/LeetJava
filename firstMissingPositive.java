/*
Given an unsorted integer array, find the first missing positive integer.

For example,
Given [1,2,0] return 3,
and [3,4,-1,1] return 2.

Your algorithm should run in O(n) time and uses constant space. 
*/
import java.util.*;
public class firstMissingPositive{
	public static void main(String[] args) {
		int[] A = {-1,4,2,1,9,10};
		System.out.println(firstMP(A));
	}
	public static int firstMP(int[] A){
		for(int i = 0; i < A.length;){
			if(A[i] > 0 && A[i] < A.length && A[i] != A[A[i]-1])
				swap(A,i, A[i]-1);
			else
				i++;
		}
		for(int i = 0; i < A.length; ++i)
			if(A[i] != i + 1)
				return i + 1;
		return A.length + 1;
	}
	public static void swap(int[] A, int i, int j){
		int temp = A[i];
		A[i] = A[j];
		A[j] = temp;
		return;
	}
}