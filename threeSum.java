/*
Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

Note:

    Elements in a triplet (a,b,c) must be in non-descending order. 
    The solution set must not contain duplicate triplets.

    For example, given array S = {-1 0 1 2 -1 -4},

    A solution set is:
    (-1, 0, 1)
    (-1, -1, 2)
*/
import java.util.*;
public class threeSum{
	public static void main(String[] args) {
		int[] num = {-1,0 ,1 ,2 ,-1, -4};
		System.out.println(threeSum(num));
	}

	public static List<List<Integer>> threeSum(int[] num){
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		if(num.length == 0)
			return res;
		Arrays.sort(num);
		for(int i = 0; i < num.length - 2 && num[i] <= 0; ++i){
			if(i > 0 && num[i] == num[i - 1])
				continue;

			int j = i + 1;
			int k = num.length - 1;
			while(j < k){
				int sum = num[i] + num[j] + num[k];
				if(sum == 0){
					List<Integer> tp = new ArrayList<Integer>(Arrays.asList(num[i],num[j],num[k]));
					res.add(tp);
					do{k --;} while(j < k && num[k] == num[k+1]);
					do{j ++;} while(j < k && num[j] == num[j-1]);
				}else if(sum > 0)
				    k --;
				else
					j ++;
			}
		}
		return res;
	}
}