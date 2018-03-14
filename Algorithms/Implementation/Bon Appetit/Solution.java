import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Bon Appetit
 *
 * @author Nicolas QUINQUENEL
 */

public class Solution {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int sum = 0;
        for (int ar_i = 0; ar_i < n; ar_i++) {
            if (ar_i != k)
                sum += in.nextInt();
            else
                in.nextInt();
        }
        int b = in.nextInt();
        
        int div = sum / 2;
        
        if (div == b) {
            System.out.println("Bon Appetit");
        } else {
            System.out.println(b - div);
        }
    }
}
