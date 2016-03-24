// Convert AM/PM Time to Military (24h) time
// https://www.hackerrank.com/challenges/time-conversion
import java.util.*;

public class TimeConversion {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String input = kb.nextLine();
        int seconds = Integer.parseInt(input.substring(6,8));
        int minutes = Integer.parseInt(input.substring(3,5));
        int hours = Integer.parseInt(input.substring(0,2));
        char apm = input.charAt(8);
		
        if ((apm == 'P' || apm == 'p') && hours != 12)
        	hours = hours + 12;
        if ((apm == 'A' || apm == 'a') && hours == 12)
        	hours = 0;
        System.out.printf("%02d:%02d:%02d", hours, minutes, seconds);
        kb.close();
    }
}
/*
Test Case #0:   0.09s 
Test Case #1:   0.09s 
Test Case #2:   0.08s 
Test Case #3:   0.08s 
Test Case #4:   0.09s 
Test Case #5:   0.09s 
Test Case #6:   0.09s 
Test Case #7:   0.09s 
Test Case #8:   0.09s 
Test Case #9:   0.08s
*/
