import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Breaking the Records
 *
 * @author Nicolas QUINQUENEL
 */
 
public class Solution {

    static void breakingRecords(int[] score) {
        int max = score[0];
        int lower = score[0];
        int nbMax = 0;
        int nbLower = 0;
        for (int sc : score) {
            if (sc > max) {
                max = sc;
                nbMax++;
            } else if (sc < lower) {
                lower = sc;
                nbLower++;
            }
        }
        System.out.println(nbMax + " " + nbLower);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] score = new int[n];
        for (int score_i = 0; score_i < n; score_i++) {
            score[score_i] = in.nextInt();
        }
        breakingRecords(score);

        in.close();
    }
}
