
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Birthday Chocolate
 *
 * @author Nicolas QUINQUENEL
 */

public class Solution {

    static int solve(int n, int[] s, int d, int m){
        int nbSolution = 0;
        for(int i = 0; i < s.length; i++) {
            boolean pos = true;
            int j = 0;
            int tmpSum = 0;
            while(pos && j < m) {
                if(i + j < s.length && tmpSum + s[i+j] <= d)
                    tmpSum += s[i+j];
                else
                    pos = false;
                j++;
            }
            if(tmpSum == d && pos)
                nbSolution++;
        }
        return nbSolution;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int d = in.nextInt();
        int m = in.nextInt();
        int result = solve(n, s, d, m);
        System.out.println(result);
    }
}
