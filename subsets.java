/*
 Given a set of distinct integers, S, return all possible subsets.

Note:

    Elements in a subset must be in non-descending order.
    The solution set must not contain duplicate subsets.

For example,
If S = [1,2,3], a solution is:

[
  [3],
  [1],
  [2],
  [1,2,3],
  [1,3],
  [2,3],
  [1,2],
  []
]
*/
import java.util.*;

public class subsets{
	public static void main(String[] args) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        int[] S = {1,2,3};
        Arrays.sort(S);
        helper(res,S,0);
		System.out.println(res);
	}
    public static void helper(List<List<Integer>> res, int[] S, int i){
        if(i == S.length){
            res.add(new ArrayList<Integer>());
            return;
        }
        helper(res,S,i + 1);
        int n = res.size();
        for(int j = 0; j < n; ++j){
            List<Integer> tp = new ArrayList<Integer>(res.get(j));
            tp.add(0,S[i]);
            res.add(tp);
        }
        return;
    }
} 