import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * CamelCase
 *
 * @author Nicolas QUINQUENEL
 */

public class Solution {

    static int camelcase(String s) {
		//Check if String is empty, otherwise split by upper cases and compute length
        return s.length() == 0 ? 0 : s.split("[A-Z]").length;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int result = camelcase(s);
        System.out.println(result);
        in.close();
    }
}