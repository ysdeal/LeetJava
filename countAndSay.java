/*
The count-and-say sequence is the sequence of integers beginning as follows:
1, 11, 21, 1211, 111221, ...

1 is read off as "one 1" or 11.
11 is read off as "two 1s" or 21.
21 is read off as "one 2, then one 1" or 1211.

Given an integer n, generate the nth sequence.

Note: The sequence of integers will be represented as a string. 
*/
import java.util.*;
public class countAndSay{
	public static void main(String[] args) {
		System.out.println(countSay(4));
	}
	public static String countSay(int n){
		if(n == 1)
			return "1";
		String pre = countSay(n - 1);
		String res = "";
		int count = 0;
		for(int p = 0; p < pre.length();){
			count = 1;
			char tp = pre.charAt(p);
			while((++p) < pre.length() && tp == pre.charAt(p))
				count ++;
            res += Integer.toString(count) + tp;
		}
		return res;
	}
}