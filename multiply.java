/*Given two numbers represented as strings, return multiplication of the numbers as a string.

Note: The numbers can be arbitrarily large and are non-negative.
*/
import java.util.*;
public class multiply{
	public static void main(String[] args) {
		System.out.println(multiply("123","12"));
	}
	public static String multiply(String num1, String num2){
        if(num1=="0" || num2 =="0")
          return "0";
        int n1 = num1.length();
        int n2 = num2.length();
        int[] resnum = new int[n1 + n2];
        char[] res = new char[n1+n2];
        System.out.println(res[0]);
        for(int i = 0; i < n1; ++i)
            for(int j = 0; j < n2; ++j)
                resnum[i+j+1] += (num1.charAt(i)-'0')*(num2.charAt(j)-'0');
            
        int rs = 0;
        int cout = 1;
        for(int i = n1 + n2 - 1; i>0; i--){
            if(resnum[i] > 9)
              resnum[i-1] += resnum[i]/10;
            rs += cout*(resnum[i]%10);
            cout *=10;
        }
        return Integer.toString(rs);		
	}
}