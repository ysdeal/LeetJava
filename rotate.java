/*
You are given an n x n 2D matrix representing an image.

Rotate the image by 90 degrees (clockwise).

Follow up:
Could you do this in-place?
*/
import java.util.*;
public class rotate{
      public static void main(String[] args) {
      	System.out.println("rotate");
      }

      public static void rotate(int[][], matrix){
      	int n = matrix.length;
        for(int i = 0; i < n/2; ++i)
           for(int j = 0; j < (n + 1)/2; ++j){
           	int temp = matrix[n-j-1][i];
           	matrix[n-j-1][i] = matrix[n-i-1][n-j-1];
           	matrix[n-i-1][n-j-1] = matrix[j][n-i-1];
           	matrix[j][n-i-1] = matrix[i][j];
           	matrix[i][j] = temp;
           }
      }
}