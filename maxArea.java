/*
Given n non-negative integers a1, a2, ..., an, where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines, which together with x-axis forms a container, such that the container contains the most water.

Note: You may not slant the container. 
*/
import java.util.*;
public class maxArea{
	public static void main(String[] args) {
		int[] height = new int[]{1,2,3,4,5};
		System.out.println("I love Ran!");
		System.out.println(maxArea(height));
	}
	public static int maxArea(int[] height){
		int i = 0, j = height.length - 1;
		int res = (j - i)*Math.min(height[i],height[j]);
		while(i < j){
			if(height[i] < height[j])
				i++;
			else
				j --;
			res = Math.max(res, (j - i)*Math.min(height[i],height[j]));
		}
		return res;
	}
}