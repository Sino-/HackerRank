//A Very Big Sum
//https://www.hackerrank.com/challenges/a-very-big-sum
import java.util.*;

public class BigSum {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        long ArraySize = kb.nextInt();
        long sum = 0;
        for (long i = 0 ; i < ArraySize ; i++)
        {
            sum+=kb.nextLong();
        }
        System.out.println(sum);
    }
}

/*
Test Case #0:   0.06s 
Test Case #1:   0.07s
*/
