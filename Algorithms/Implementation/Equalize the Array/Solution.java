import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Equalize the Array
 * O(n) solution thanks to HashMap
 *
 * @author Nicolas QUINQUENEL
 */
 
public class Solution {

    static int equalizeArray(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        int max = 1;
        for (int i = 0; i < arr.length; i++) {
            int key = arr[i];
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
                if (max < map.get(key)) {
                    max = map.get(key);
                }
            } else {
                map.put(key, 1);
            }
        }
        
        return arr.length - max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int result = equalizeArray(arr);
        System.out.println(result);
        in.close();
    }
}