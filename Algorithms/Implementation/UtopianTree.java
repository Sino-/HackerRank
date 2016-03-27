

//https://www.hackerrank.com/challenges/utopian-tree
import java.util.*;

public class UtopianTree {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int cases = kb.nextInt();
        int cycles=0,height=1;
        
        for (int i=0; i < cases; i++)
        {
        	cycles=kb.nextInt();
        	for (int j=0; j<cycles;j++)
        	{
        		if ( j % 2 == 0)
        			height*=2;
        		else
        			height++;
        	}
        	System.out.println(height);
            //reset height for next tree
            height=1;
        }
        kb.close();
    }
}

/*
Test Case #0:   0.06s 
Test Case #1:   0.06s 
Test Case #2:   0.06s 
Test Case #3:   0.06s 
Test Case #4:   0.06s 
Test Case #5:   0.06s 
Test Case #6:   0.06s 
Test Case #7:   0.06s 
Test Case #8:   0.06s 
Test Case #9:   0.06s
*/
