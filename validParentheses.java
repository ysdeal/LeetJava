/*
Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
*/
import java.util.*;
public class validParentheses{
	public static void main(String[] args) {
		System.out.println(isValid("((())){}"));
	}
	public static boolean isValid(String s){
		Stack<Character> pt = new Stack<Character>();
		for(int i = 0; i < s.length(); ++i){
			if(s.charAt(i) == '(' || s.charAt(i) == '[' 
				|| s.charAt(i) == '{')
				pt.push(s.charAt(i));
			else{
                 if(pt.empty())
                 	return false;
                 if(s.charAt(i)==')' && pt.peek() != '(')
                 	return false;
                 if(s.charAt(i)=='}' && pt.peek() != '{')
                 	return false;
                 if(s.charAt(i)==']' && pt.peek() != '[')
                 	return false; 
                 pt.pop();              
			}
		}
		if (pt.empty())
			return true;
		else
			return false;
	}
}