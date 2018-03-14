import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Apple and Orange
 *
 * @author Nicolas QUINQUENEL
 */

public class Solution {

    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int nbApples = 0;
        for (int i = 0; i < apples.length; i++) {
            int applePos = a + apples[i];
            if (applePos >= s && applePos <= t)
                nbApples++;
        }
        
        int nbOranges = 0;
        for (int i = 0; i < oranges.length; i++) {
            int orangePos = b + oranges[i];
            if (orangePos >= s && orangePos <= t)
                nbOranges++;
        }
        
        System.out.println(nbApples + "\n" + nbOranges);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        for (int apple_i = 0; apple_i < m; apple_i++) {
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for (int orange_i = 0; orange_i < n; orange_i++) {
            orange[orange_i] = in.nextInt();
        }
        
        countApplesAndOranges(s, t, a, b, apple, orange);
        in.close();
    }
}
