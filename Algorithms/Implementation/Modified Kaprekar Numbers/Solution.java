import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Modified Kaprekar Numbers
 *
 * @author Nicolas QUINQUENEL
 */

public class Solution {

    static void kaprekarNumbers(int p, int q) {
    	boolean notFound = true;
    	
        for (long i = p; i <= q; i++) {
        	long value = i * i;
        	
        	String stringValue = String.valueOf(value);
            String leftPart  = stringValue.substring(0, stringValue.length() / 2);
            String rightPart = stringValue.substring(stringValue.length() / 2);

            long valueLeft = (leftPart.isEmpty())  ? 0 : Long.parseLong(leftPart);
            long valueRight = (rightPart.isEmpty()) ? 0 : Long.parseLong(rightPart);
            
            if (valueLeft + valueRight == i) {
                System.out.print(i + " ");
                notFound = false;
            }
        }
        
        if (notFound) {
        	System.out.print("INVALID RANGE");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p = in.nextInt();
        int q = in.nextInt();
        
        kaprekarNumbers(p, q);

        in.close();
    }
}

