/*
Given a set of candidate numbers (C) and a target number (T), find all unique combinations in C where the candidate numbers sums to T.

The same repeated number may be chosen from C unlimited number of times.

Note:

    All numbers (including target) will be positive integers.
    Elements in a combination  must be in non-descending order. 
    The solution set must not contain duplicate combinations.

For example, given candidate set 2,3,6,7 and target 7,
A solution set is:
[7]
[2, 2, 3] 
*/
import java.util.*;
public class combinationSum{
	public static void main(String[] args) {
		int[] candidates = {1,1,2,2,3,4,5};
		 List<List<Integer>> res = new ArrayList<List<Integer>>();
		 Arrays.sort(candidates);
		 combinSum(candidates,5,0,new ArrayList<Integer>(),res);
		 System.out.println(res);
	}
	public static void combinSum(int[] candidates, int target, int sid, List<Integer> tp, List<List<Integer>> res){
          if(target < 0)
          	return;

          if(target == 0){
          	res.add(new ArrayList<Integer>(tp));
          	return;
          }
          	
          for(int i = sid; i < candidates.length; ++i){
          	if(i > sid && candidates[i] == candidates[i-1])
          		continue;
          	tp.add(candidates[i]);
          	combinSum(candidates,target - candidates[i], i, tp,res);
          	tp.remove(tp.size() - 1);
          }
          return;

	}

	// use only once II
		public static void combinSumII(int[] candidates, int target, int sid, List<Integer> tp, List<List<Integer>> res){
          if(target < 0)
          	return;

          if(target == 0){
          	res.add(new ArrayList<Integer>(tp));
          	return;
          }
          	
          for(int i = sid; i < candidates.length; ++i){
          	if(i > sid && candidates[i] == candidates[i-1])
          		continue;
          	tp.add(candidates[i]);
          	combinSum(candidates,target - candidates[i], i+1, tp,res);
          	tp.remove(tp.size() - 1);
          }
          return;

	}
}