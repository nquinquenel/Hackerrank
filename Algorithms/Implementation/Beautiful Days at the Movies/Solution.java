import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Beautiful Days at the Movie
 *
 * @author Nicolas QUINQUENEL
 */

public class Solution {

    static int reverse(int i) {
        int ret = 0;
        
        while (i != 0) {
            ret = ret * 10;
            ret = ret + i % 10;
            i = i / 10;
        }
        
        return ret;
    }
    
    static int beautifulDays(int i, int j, int k) {
        int ret = 0;
        
        for (i = i; i <= j; i++) {
            if (((double) Math.abs(i - Solution.reverse(i)) % k) == 0) {
                ret++;
            }
        }
                   
        return ret;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        int j = in.nextInt();
        int k = in.nextInt();
        int result = beautifulDays(i, j, k);
        System.out.println(result);
        in.close();
    }
}