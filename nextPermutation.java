/*
 Implement next permutation, which rearranges numbers into the lexicographically next greater permutation of numbers.

If such arrangement is not possible, it must rearrange it as the lowest possible order (ie, sorted in ascending order).

The replacement must be in-place, do not allocate extra memory.

Here are some examples. Inputs are in the left-hand column and its corresponding outputs are in the right-hand column.
1,2,3 -- 1,3,2
3,2,1 -- 1,2,3
1,1,5 -- 1,5,1
*/
import java.util.*;
public class nextPermutation{
	public static void main(String[] args) {
		int[] A ={1,3,2};
		permute(A);
		for(int i = 0; i < A.length; ++i)
			System.out.print(" " + A[i]);
	}
	public static void permute(int[] num){
		if(num == null && num.length == 1)
			return;
		int k = -1;
		for(int i = 0; i < num.length - 1; ++i)
			if(num[i] < num[i + 1])
				k = i;
		if(k == -1){
			k = 0;
			int r = num.length - 1;
			//Collections.reverse(Arrays.asList(num));
			while(k < r){
				int tmp = num[k];
				num[k] = num[r];
				num[r] = tmp;
               k ++;
               r --;
            }
			return;
		}
        
        int p = k;
		for(int i = k + 1; i < num.length; ++i)
            if(num[k] < num[i])
            	p = i;
        // swap 
		int vz = num[k];
		num[k] = num[p];
		num[p] = vz;
        k += 1;
        int r = num.length - 1;
        while(k < r){
			int tmp = num[k];
			num[k] = num[r];
			num[r] = tmp;
            k ++;
            r --;
        }
        return;
	}
}