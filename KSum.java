/*
K Sum
*/

import java.util.*;
public class KSum{
	public static void main(String[] args) {
		int[] num = {-1,-1,-1,2,0,1,1,3};
		System.out.println(fourSum(num));
	}

	public static List<List<Integer>> findSumFromSortArray(int[] num, int bg, int count, int target){
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		HashSet<Integer> visited = new HashSet<Integer>();
		if(count == 2){
           int i = bg, j = num.length - 1;
           while(i < j){
           	int sum = num[i] + num[j];
           	if(sum == target && !visited.contains(num[i]) 
           	   && !visited.contains(num[j])){
           	   	List<Integer> tp = new ArrayList<Integer>(Arrays.asList(num[i],num[j]));
                 res.add(tp);
                 i++;
                 j--;
                 visited.add(num[i]);
                 visited.add(num[j]);               
           	}else if (sum < target)
           	   i++;
           	else
           	   j--;
           }

		}else{
              for(int i = bg; i < num.length && num[i] < target; ++i){
              	if(visited.contains(num[i]))
              		continue;
              	visited.add(num[i]);
              	List<List<Integer>> subRes = findSumFromSortArray(num, i + 1, count - 1, target - num[i]);
              	if(subRes != null){
              		for(List<Integer> sb : subRes)
              			sb.add(0,num[i]);

              		res.addAll(subRes);
              	}
              }
		}

		return res;
	}

	public static List<List<Integer>> fourSum(int[] num){
		Arrays.sort(num);
		return findSumFromSortArray(num,0, 4, 0);
	}
}