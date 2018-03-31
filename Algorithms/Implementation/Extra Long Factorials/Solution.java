import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Extra Long Factorials
 *
 * @author Nicolas QUINQUENEL
 */

public class Solution {

    static void extraLongFactorials(int n) {
        BigInteger bi = BigInteger.valueOf(n);
        while (--n > 1) {
            bi = bi.multiply(BigInteger.valueOf(n));
        }
        System.out.println(bi.toString());
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        extraLongFactorials(n);
        in.close();
    }
}