/*
Determine if a Sudoku is valid, according to: Sudoku Puzzles - The Rules.

The Sudoku board could be partially filled, where empty cells are filled with the character '.'.
*/
import java.util.*;
public class isValidSudoku{
	public static void main(String[] args) {
		System.out.println("Is Valid Sudoku?");
	}
	public static boolean isValidSudoku(char[][] board){
		boolean[][] row = new boolean[9][9];
		boolean[][] col = new boolean[9][9];
		boolean[][] block = new boolean[9][9];
		for(int r = 0; r < 9; ++r)
		   for(int c = 0; c < 9; ++c){
		       if(board[r][c] == '.')
		          continue;
		       int num = board[r][c] - '1';
		       int bid = r - r%3 + c/3;
		       if(row[r][num] || col[c][num] || block[bid][num])
		          return false;
		       row[r][num] = col[c][num] = block[bid][num] = true;
		   }
		return true;
	}
}