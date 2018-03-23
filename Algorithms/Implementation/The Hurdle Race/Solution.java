import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * The Hurdle Races
 *
 * @author Nicolas QUINQUENEL
 */

public class Solution {

    static int hurdleRace(int k, int[] height) {
        return Arrays.stream(height).summaryStatistics().getMax() - k < 0 ? 0 : Arrays.stream(height).summaryStatistics().getMax() - k;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] height = new int[n];
        for(int height_i = 0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
        }
        int result = hurdleRace(k, height);
        System.out.println(result);
        in.close();
    }
}
