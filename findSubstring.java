/*
You are given a string, S, and a list of words, L, that are all of the same length. Find all starting indices of substring(s) in S that is a concatenation of each word in L exactly once and without any intervening characters.

For example, given:
S: "barfoothefoobarman"
L: ["foo", "bar"]

You should return the indices: [0,9].
(order does not matter). 
*/

import java.util.*;
public class findSubstring{
	public static void main(String[] args) {
		String S = "barfoothefoobarman";
		String[] L = {"foo","bar"};
		List<Integer> res = findSub(S, L);
		System.out.println(res);
	}
	public static List<Integer> findSub(String S, String[] L){
		List<Integer> res = new ArrayList<Integer>();
		if(S == null || L == null)
			return res;
		if(L[0].length()*L.length > S.length())
			return res;
        HashMap<String,Integer> Lmap = new HashMap<String,Integer>();
        HashMap<String,Integer> Cmap = new HashMap<String,Integer>();
        for(String t : L)
        	if(!Lmap.containsKey(t))
        		Lmap.put(t,1);
        	else
                Lmap.put(t,Lmap.get(t) + 1);
        int wordSize = L[0].length();
        int numStr = L.length;
        for(int i = 0; i < S.length() - numStr*wordSize + 1; ++i){
        	if(!Cmap.isEmpty())
        		Cmap.clear();
        	int j = 0;
        	for(j = 0; j < numStr; ++j){
        		String tr = S.substring(i+j*wordSize,i+(j+1)*wordSize);
        		if(!Lmap.containsKey(tr))
        			break;
        		if(!Cmap.containsKey(tr))
        			Cmap.put(tr,1);
        		else{
        			Cmap.put(tr,Cmap.get(tr) + 1);
        			if(Cmap.get(tr) > Lmap.get(tr))
        				break;
        		}
        	}

        	if(j == numStr) res.add(i);
        } 
		return res;
	}
}