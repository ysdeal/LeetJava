/*Given a digit string, return all possible letter combinations that the number could represent.
A mapping of digit to letters (just like on the telephone buttons) is given below.

Input:Digit string "23"
Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
*/
import java.util.*;
public class letterCombinations{
  public static void main(String[] args) {
  	String digits = "235";
  	String[] map = {" ", "", "abc","def", "ghi", "jkl","mno","pqrs","tuv","wxyz"};
    List<String> res = new ArrayList<String>();
    char[] cs = new char[digits.length()];
    letter(digits,0,cs,res,map);
    System.out.println(res);
    return;
  }

  public static void letter(String digits, int i, char[] cs, List<String> res, String[] map){
     if(i == digits.length()){
     	res.add(new String(cs));
        return;
     }
     String lt = map[digits.charAt(i) - '0'];
     for(int j = 0; j < lt.length(); ++j){
     	cs[i] = lt.charAt(j);
     	letter(digits, i+1, cs, res, map);
     }
  }
}