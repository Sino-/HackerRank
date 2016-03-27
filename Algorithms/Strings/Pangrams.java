//Given a sentence, determin if it is a pangram or not.
//https://www.hackerrank.com/challenges/pangrams
import java.util.*;

public class Pangrams {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String line = kb.nextLine();
        //char[] elements = new char[line.length()];
        char[] letters = new char[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        boolean[] alphabet = new boolean[26];
        String output_modifier = "";
        for (int i=0; i<26; i++)
        	alphabet[i]=false;
        for (int i=0; i < 26; i++)
        {
        	for (int j=0, k=line.length(); j < k; j++)
        	{
        		
        		if (Character.toLowerCase(letters[i]) == Character.toLowerCase(line.charAt(j)))
        			alphabet[i] = true;
        	}
        }
        for (int i=0; i < 26; i++)
        {
        	if (alphabet[i] == false)
        	{
        		output_modifier="not ";
        		continue;
        	}
        }
        System.out.println(output_modifier+"pangram");
        
        kb.close();
    }
}
/*
Test Case #0:   0.07s 
Test Case #1:   0.08s 
Test Case #2:   0.06s 
Test Case #3:   0.07s 
Test Case #4:   0.08s 
Test Case #5:   0.09s 
Test Case #6:   0.1s 
Test Case #7:   0.1s 
Test Case #8:   0.1s
*/
