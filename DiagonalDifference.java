// Given a square matrix of size N×NN×N, calculate the absolute difference between the sums of its diagonals.
// https://www.hackerrank.com/challenges/diagonal-difference
import java.util.*;

public class DiagonalDifference {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int Lines = kb.nextInt();
        int [][] matrix = new int[Lines][Lines];
        for (int i=0; i< Lines ; i++)
        {
        	for (int j = 0; j < Lines ; j++)
        	matrix[i][j] = kb.nextInt();
        }
        int sum1 = 0; 
        int sum2 = 0;
        for (int i = 0 ; i < Lines ; i++)
        {
            int position_differential1 = (Lines - 1) - i;
            int position_differential2 = i;
            sum1+= matrix[i][position_differential1];
            sum2+= matrix[i][position_differential2];
        }
        
        System.out.println(Math.abs(sum1-sum2));
    }
}
/* 
Test Case #0:   0.06s 
Test Case #1:   0.06s 
Test Case #2:   0.06s 
Test Case #3:   0.06s 
Test Case #4:   0.05s 
Test Case #5:   0.06s 
Test Case #6:   0.12s 
Test Case #7:   0.37s 
Test Case #8:   0.26s 
Test Case #9:   0.35s 
Test Case #10:  0.38s
*/
