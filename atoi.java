/*
Implement atoi to convert a string to an integer.

Hint: Carefully consider all possible input cases. If you want a challenge, please do not see below and ask yourself what are the possible input cases.

Notes: It is intended for this problem to be specified vaguely (ie, no given input specs). You are responsible to gather all the input requirements up front. 
*/
import java.util.*;
public class atoi{
	public static void main(String[] args) {
		String str = new String("2147483648");
		System.out.println(atoi(str));
	}
	public static int atoi(String str){
        if (str.isEmpty())
           return 0;
        int pos = 0;
        while(str.charAt(pos) == ' ')
            pos ++;
        boolean sign = true;
        if(str.charAt(pos) == '+')
          pos++;
        else if(str.charAt(pos) == '-'){
            sign = false;
            pos ++;
        }
        
        long res = 0;
        while(pos < str.length() && Character.isDigit(str.charAt(pos))){
            res = res * 10 + str.charAt(pos) - '0';
            if (res > Integer.MAX_VALUE && sign) 
                return Integer.MAX_VALUE;
            else if (!sign && -res < Integer.MIN_VALUE)
               return Integer.MIN_VALUE;
            pos ++;
        }
        if(sign) return (int) res;
        else return (int) -res;
	}
}