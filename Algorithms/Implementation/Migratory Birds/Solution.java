import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Migratory Birds
 *
 * @author Nicolas QUINQUENEL
 */

public class Solution {

    static int migratoryBirds(int n, int[] ar) {
    	//Count each occurence
        HashMap<Integer, Integer> l = new HashMap<Integer, Integer>();
        for (int i : ar) {
        	l.merge(i, 1, Integer::sum);
        }
        
        //Find the highest occurence
        int max = 0;
        int maxValue = 0;
        for (Integer key : l.keySet()) {
            if (maxValue < l.get(key)) {
            	maxValue = l.get(key);
            	max = key;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for (int ar_i = 0; ar_i < n; ar_i++) {
            ar[ar_i] = in.nextInt();
        }
        int result = migratoryBirds(n, ar);
        System.out.println(result);
    }
}
