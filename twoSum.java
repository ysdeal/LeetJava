/*
Given an array of integers, find two numbers such that they add up to a specific target number.

The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.

You may assume that each input would have exactly one solution.

Input: numbers={2, 7, 11, 15}, target=9
Output: index1=1, index2=2 
*/
import java.util.*;

public class twoSum{
	public int[] twosum(int[] numbers, int target){
		int[] res = new int[2];
		HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
		for(int i : numbers){
			if(map.containsKey(numbers[i])){
				int ind = map.get(numbers[i]);
				res[0] = ind + 1;
				res[1] = i + 1;
				return res;
			}
			map.put(target - numbers[i], i);
		}
		return res;
	}
	public static void main (String[] args){
		int[] numbers ={1,2,3,4,7,5,6};
		int target = 10;
		twoSum t = new twoSum();
        int[] vec = t.twosum(numbers,target);
        System.out.println(vec[0]);
        System.out.println(vec[1]);
	}
} 