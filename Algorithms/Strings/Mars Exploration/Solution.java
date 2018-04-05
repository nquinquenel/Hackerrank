import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Mars Exploration
 *
 * @author Nicolas QUINQUENEL
 */

public class Solution {

    static int marsExploration(String s) {
        int ret = 0;
		//Split the String in array of 3 characters
        for (String ele : s.split("(?<=\\G...)")) {
            if (ele.charAt(0) != 'S') {
                ret++;
            }
            if (ele.length() > 1 && ele.charAt(1) != 'O') {
                ret++;
            }
            if (ele.length() > 2 && ele.charAt(2) != 'S') {
                ret++;
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int result = marsExploration(s);
        System.out.println(result);
        in.close();
    }
}
