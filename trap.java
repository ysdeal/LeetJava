/*
 Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it is able to trap after raining.

For example,
Given [0,1,0,2,1,0,1,3,2,1,2,1], return 6. 
*/
import java.util.*;
public class trap{
	public static void main(String[] args) {
		int[] A ={0,1,0,2,1,0,1,3,2,1,2,1};
		System.out.println(trp(A));
	}
	public static int trp(int[] A){
		int res = 0;
		if(A.length < 2)
			return res;
		int i = 0;
		int j = A.length -1;
		int k = 0;
		while(i < j){
			System.out.println(i + " " + j);
			if(A[i] <= A[j]){
				k = i + 1;
				while(A[i] > A[k]){
					res += A[i] - A[k];
					k ++;
				}
				i = k;
			}else{
				k = j - 1;
				while(A[j] > A[k]){
					res += A[j] - A[k];
					k --;
				}

				j = k;
			}
		}
		return res;
	}
}