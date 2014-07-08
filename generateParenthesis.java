/*
Given an array of integers, find two numbers such that they add up to a specific target number.

The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.

You may assume that each input would have exactly one solution.

Input: numbers={2, 7, 11, 15}, target=9
Output: index1=1, index2=2 
*/
import java.util.*;

public class generateParenthesis{
	public static void main(String[] args) {
		List<String> res = new ArrayList<String>();
		generate(res,"",0,0,3);
		System.out.println(res);
	}
	public static void generate(List<String> res, String s, int l, int r, int n){
		if(l == n){
			StringBuilder sb = new StringBuilder(n - r);
			for(int i = 0; i < n - r; ++i)
				sb.append(")");
			res.add(s + sb.toString());
			return;
		}
		generate(res, s + "(", l + 1, r, n);
		if( l > r)
			generate(res, s + ")", l, r + 1, n);
	}
} 