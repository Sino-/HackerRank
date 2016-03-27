
//https://www.hackerrank.com/challenges/java-if-else
import java.util.*;

public class IfElse {

  public static void main(String[] args) {

    Scanner kb=new Scanner(System.in);
    int n=kb.nextInt();            
    String ans="";

    if(n%2==1 || (n >= 6 && n <= 20))
        ans = "Weird";
    else
       ans = "Not Weird";

    System.out.println(ans);
  
  }
}
    /*
    Test Case #0:   0.06s 
    Test Case #1:   0.06s 
    Test Case #2:   0.06s 
    Test Case #3:   0.05s 
    Test Case #4:   0.06s 
    Test Case #5:   0.06s 
    Test Case #6:   0.06s 
    Test Case #7:   0.06s
    */
