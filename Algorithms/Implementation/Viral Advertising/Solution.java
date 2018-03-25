import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Viral Advertising
 *
 * @author Nicolas QUINQUENEL
 */

public class Solution {

    static int viralAdvertising(int n) {
        int ret = 0;
        int p = 5;
        
        for(int i = 0; i < n; i++){
            p = (int) Math.floor(p / 2);
            ret += p;
            p *= 3;
        }
        
        return ret;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int result = viralAdvertising(n);
        System.out.println(result);
        in.close();
    }
}
