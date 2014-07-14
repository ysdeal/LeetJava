/*
Divide two integers without using multiplication, division and mod operator.
*/
import java.util.*;
public class divide{
	public static void main(String[] args) {
		System.out.println(divide(50,-3));
	}
	public static int divide(int divident, int divisor){
		long a = Math.abs((long) divident);
		long b = Math.abs((long) divisor);
		long res = 0;
		while(a >= b){
			long c = b;
			for(int i = 0; a >= c; ++i, c <<= 1){
				a -= c;
				res += 1<<i;
			}
		}
		int z = (divident ^ divisor) >>31;
		if(z == -1)
			return (int)-res;
		else
			return (int) res;
	}
}