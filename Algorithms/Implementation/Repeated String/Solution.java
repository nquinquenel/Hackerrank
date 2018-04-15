import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Repeated String
 *
 * @author Nicolas QUINQUENEL
 */

public class Solution {

    static long repeatedString(String s, long n) {
        long ret = 0;
        
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'a') {
                ret++;   
            }
        }
        
        ret = (n / s.length()) * ret;
        long r = (n % s.length());
        
        for(int i = 0; i < r; i++) {
            if(s.charAt(i) == 'a') {
                ret++;   
            }
        }      
        
        return ret;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        long n = in.nextLong();
        long result = repeatedString(s, n);
        System.out.println(result);
        in.close();
    }
}
