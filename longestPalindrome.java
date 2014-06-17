/*
Given a string S, find the longest palindromic substring in S. You may assume that the maximum length of S is 1000, and there exists one unique longest palindromic substring.
*/
import java.util.*;
public class longestPalindrome{
	public static void main(String[] args) {
		String input = new String("abababbsbadfasdfasaccccccca");
		System.out.println(longestPalindrome(input));
	}
	public static String longestPalindrome(String s){
        if(s.isEmpty())
           return null;
        if(s.length() == 1)
           return s;
        String res = s.substring(0,1);
        for(int i = 0; i < s.length(); ++i){
            String tp = helper(s,i,i);
            if(tp.length() > res.length())
               res = tp;
               
            tp = helper(s,i,i+1);
            if(tp.length() > res.length())
               res = tp;
        }
        return res;		
	}
	public static String helper(String s, int beg, int end){
        while(beg >=0 && end < s.length() && s.charAt(beg) == s.charAt(end)){
            beg --;
            end ++;
        }
        return s.substring(beg+1,end);		
	}
}