/*
Given an array S of n integers, find three integers in S such that the sum is closest to a given number, target. Return the sum of the three integers. You may assume that each input would have exactly one solution.

    For example, given array S = {-1 2 1 -4}, and target = 1.

    The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
*/
import java.util.*;
public class threeSumClosest{
	public static void main(String[] args) {
		int[] num = {1,2,3,4,5};
		System.out.println(threeSumC(num,2));
		static int[] a ={1, 2};
		System.out.println(a[0]);
		test(a);
		System.out.println(a[0]);
		final int[] b ={1,2};
		System.out.println(b[0]);
		test(b);
		System.out.println(b[0]);		
	}
	public static int threeSumC(int[] num, int target){
		int res = 0;
		int diff = Integer.MAX_VALUE;
		if (num == null)
			return res;
		Arrays.sort(num);
		for(int i = 0; i < num.length - 2; ++i){
			if(i > 0 && num[i] == num[i-1])
				continue;
			int j = i + 1;
			int k = num.length - 1;
			while(j < k){
				int sum = num[i] + num[j] + num[k];
				int sdiff = sum - target;
				if(Math.abs(sdiff) < diff){
					diff = Math.abs(sdiff);
					res = sum;
				}

				if(sdiff == 0) return 0;
				if(sdiff > 0) k --;
				else
					j ++;
			}
		}
		return res;
	}
	public static void test(int[] a){
		a[0] = 4;
		return;
	}
}