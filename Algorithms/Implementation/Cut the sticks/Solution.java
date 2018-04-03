import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Cut the sticks
 *
 * @author Nicolas QUINQUENEL
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void cutTheSticks(int[] arr) {
        boolean end = true;
        while (end) {
            end = false;
            boolean step = false;
            int nbCut = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > 0) {
                    end = true;
                    arr[i]--;
                    nbCut++;
                    if (arr[i] == 0) {
                        step = true;
                    }
                }
            }
            if (step) {
                System.out.println(nbCut);
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        cutTheSticks(arr);
        System.out.println("");


        in.close();
    }
}
