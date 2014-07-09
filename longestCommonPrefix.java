/*
Write a function to find the longest common prefix string amongst an array of strings. 
*/
import java.util.*;
public class longestCommonPrefix{
	public static void main(String[] args) {
		String[] strs = {"aaaaaaa","aab"};
		System.out.println(longest(strs));
	}
	public static String longest(String[] strs){
		if(strs.length == 0)
			return "";
		else if(strs.length == 1)
			return strs[0];

		int pos = strs[0].length();
		for(int i = 0; i < strs.length-1; ++i){
			int count = 0;
			pos = Math.min(pos,strs[i+1].length());
			for(int j = 0; j < pos; ++j){
                if(strs[i].charAt(j) != strs[i+1].charAt(j)){
                	pos = count;
                	if(pos == 0)
                		return "";
                }	
                count ++;
			}
		}
		return strs[0].substring(0,pos); 
	}
}