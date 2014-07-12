/*
Given an array and a value, remove all instances of that value in place and return the new length.

The order of elements can be changed. It doesn't matter what you leave beyond the new length. 
*/
import java.util.*;
public class removeElementFromArray{
	public static void main(String[] args) {
		int[] A = {1,2,3,1,1,2};
		int l = removeElement(A,1);
		System.out.println(l);
	}
	public static int removeElement(int[] A, int elem){
        if(A == null)
           return 0;
        int l = 0;
        for(int i = 0; i < A.length; ++i){
            if(A[i] != elem)
              A[l++] = A[i];
        }
        return l;		
	}
}