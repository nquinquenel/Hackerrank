import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Jumping on the Clouds: Revisited
 *
 * @author Nicolas QUINQUENEL
 */

public class Solution {

    static int jumpingOnClouds(int[] c, int k) {
        int e = 100;
        for (int i = 0; i < c.length; i = k + i) {
            if (c[(i + k) % c.length] == 0) {
                e = e - 1;
            } else {
                e = e - 3;
            }    
        }
        return e;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] c = new int[n];
        for(int c_i = 0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        int result = jumpingOnClouds(c, k);
        System.out.println(result);
        in.close();
    }
}
