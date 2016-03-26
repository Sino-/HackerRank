
//https://www.hackerrank.com/challenges/simple-array-sum
import java.util.*;

public class ArraySum {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int ArraySize = kb.nextInt();
        int sum = 0;
        for (int i = 0 ; i < ArraySize ; i++)
        {
            sum+=kb.nextInt();
        }
        kb.close();
        System.out.println(sum);
    }
}


/*
Test Case #0:   0.06s 
Test Case #1:   0.06s 
Test Case #2:   0.13s
*/
