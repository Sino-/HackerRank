
//https://www.hackerrank.com/challenges/java-stdin-stdout
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int x=sc.nextInt();
            sc.nextLine();
            double y = sc.nextDouble();
            sc.nextLine();
            String s = sc.nextLine();

            System.out.println("String: "+s);
            System.out.println("Double: "+y);
            System.out.println("Int: "+x);
    }
}

/*
Test Case #0:   0.07s 
Test Case #1:   0.06s 
Test Case #2:   0.06s 
Test Case #3:   0.07s 
Test Case #4:   0.07s
*/
