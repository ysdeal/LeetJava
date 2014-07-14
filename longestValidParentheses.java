/*
Given a string containing just the characters '(' and ')', find the length of the longest valid (well-formed) parentheses substring.

For "(()", the longest valid parentheses substring is "()", which has length = 2.

Another example is ")()())", where the longest valid parentheses substring is "()()", which has length = 4. 
*/
import java.util.*;
public class longestValidParentheses{
	public static void main(String[] args) {
		String s = "((((())())))()))";
        System.out.println(longest(s));
	}
	public static int longest(String s){
		if(s == null || s.length() == 1)
			return 0;
		int res = 0;
		int n = s.length();
		int[] d = new int[n];
		for(int i = 1; i < n; ++i){
			if(s.charAt(i) == ')'){
				int id = i - 1 - d[i-1];
				if(id >= 0 && s.charAt(id) == '(')
					d[i] = d[i-1] + 2;
				if(id >= 1)
					d[i] += d[i-1];
			}
			res = res < d[i]? d[i] : res;
		}
		return res;
	}
}