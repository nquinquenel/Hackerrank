import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Sock Merchant
 *
 * @author Nicolas QUINQUENEL
 */

public class Solution {

    static int sockMerchant(int n, int[] ar) {
    	int sockPairs = 0;
        Map<Integer, Integer> m = new HashMap<Integer, Integer>();
        
        for(int sock : ar) {
            //Java 8 only
        	m.merge(sock, 1, Integer::sum);
        }
        
        for(Map.Entry<Integer, Integer> entry : m.entrySet()) {
            sockPairs += entry.getValue() / 2;
        }
        
        return sockPairs;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = sockMerchant(n, ar);
        System.out.println(result);
    }
}
