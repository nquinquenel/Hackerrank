import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Designer PDF Viewer
 *
 * @author Nicolas QUINQUENEL
 */

public class Solution {

    static int designerPdfViewer(int[] h, String word) {
        int highest = 0;
        String[] tab = word.split("");
        for (int i = 0; i < tab.length; i++) {
            if (highest < h[((int) tab[i].charAt(0) - 97)])
                highest = h[((int) tab[i].charAt(0) - 97)];
        }
        return word.length() * highest;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] h = new int[26];
        for (int h_i = 0; h_i < 26; h_i++) {
            h[h_i] = in.nextInt();
        }
        String word = in.next();
        int result = designerPdfViewer(h, word);
        System.out.println(result);
        in.close();
    }
}

