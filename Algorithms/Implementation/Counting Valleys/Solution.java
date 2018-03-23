import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Counting Valleys
 *
 * @author Nicolas QUINQUENEL
 */

public class Solution {

    static int countingValleys(int n, String s) {
        String[] valley = s.split("");
        int nbValley = 0;
        int stack = 0;
        
        for (String ele : valley) {
            if (ele.equals("U")) {
            	stack++;
            } else {
            	stack--;
            }
            if (stack == 0 && ele.equals("U")) {
            	nbValley++;
            }
        }
        
        return nbValley;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int result = countingValleys(n, s);
        System.out.println(result);
        in.close();
    }
}
