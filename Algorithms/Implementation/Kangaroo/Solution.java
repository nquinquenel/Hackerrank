import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Kangaroo
 *
 * @author Nicolas QUINQUENEL
 */

public class Solution {

    static String kangaroo(int x1, int v1, int x2, int v2) {
        //We are trying to check if x1 + kv1 == x2 + kv2 where k is a number of jumps
        //Therefore, we want to see if k == (x2 - x1) / (v1 - v2)
        //Obviously, k needs to be a positive integer, otherwise they won't meet each other
        
        //First, we make sure that we won't divide by 0
        if ((v1 - v2) == 0)
            return "NO";
        //Then, we check if k is an integer and that it is positive
        else if (((x2 - x1) % (v1 - v2)) == 0 && ((x2 - x1) / (v1 - v2)) > 0)
            return "YES";
        //Else, it is false
        else
            return "NO";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        String result = kangaroo(x1, v1, x2, v2);
        System.out.println(result);
    }
}
