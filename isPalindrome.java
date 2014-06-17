/*
Determine whether an integer is a palindrome. Do this without extra space.
*/
import java.util.*;
public class isPalindrome{
	public static void main(String[] args) {
		System.out.println(isPalindrome(10000001));
	}
    public static boolean isPalindrome(int x) {
        if(x < 0) return false;
        int div = 1;
        while(x/div >= 10) div *= 10;
        while(x != 0){
            int l = x/div;
            int r = x%10;
            if(l != r)
              return false;
            x = (x%div)/10;
            div /= 100;
        }
        return true;
    }
}