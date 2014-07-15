/*
Suppose a sorted array is rotated at some pivot unknown to you beforehand.

(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).

You are given a target value to search. If found in the array return its index, otherwise return -1.

You may assume no duplicate exists in the array.
*/
import java.util.*;
public class searchRSA{
	public static void main(String[] args) {
		int[] A = {4,5,6,7,0,1,2};
		System.out.println(search(A,0));
		int[] B={1,1,1,2,3,4,1,1,1,1,1,1,1};
		System.out.println(searchDuplicates(B,2));
	}
	public static int search(int[] A, int target){
		int L = 0;
		int R = A.length-1;
		while(L <= R){
			int M = (R - L)/2 + L;
			if(A[M] == target) return M;
			if(A[L] <= A[M]){
				if(A[L] <= target && target < A[M])
					R = M - 1;
				else
					L = M + 1;
			}else{
				if(A[R] >= target && target > A[M])
					L = M + 1;
				else
					R = M - 1;
			}
		}
		return -1;
	}

	public static boolean searchDuplicates(int[] A, int target){
		int L = 0;
		int R = A.length-1;
		while(L <= R){
			int M = (R - L)/2 + L;
			if(A[M] == target) return true;
			if(A[L] < A[M]){
				if(A[L] <= target && target < A[M])
					R = M - 1;
				else
					L = M + 1;
			}else if(A[R] > A[M]){
				if(A[R] >= target && target > A[M])
					L = M + 1;
				else
					R = M - 1;
			}else{
				while(L <= M && A[L] == A[M])
					L ++;
				while(M <= R && A[R] == A[M])
					R --;
			}
		}
		return false;
	}

}