import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Cavity Map
 *
 * @author Nicolas QUINQUENEL
 */

public class Solution {

    static String[][] cavityMap(String[][] grid, int n) {
    	String[][] grid_ret = new String[n][n];
    	grid_ret[0] = grid[0];
        for (int i = 1; i < grid.length - 1; i++) {
        	grid_ret[i][0] = grid[i][0];
        	for (int j = 1; j < grid.length - 1; j++) {
        		if (grid[i][j].compareTo(grid[i - 1][j]) > 0 
        				&& grid[i][j].compareTo(grid[i + 1][j]) > 0
        				&& grid[i][j].compareTo(grid[i][j - 1]) > 0 
        				&& grid[i][j].compareTo(grid[i][j + 1]) > 0) {
        			grid_ret[i][j] = "X";
        		} else {
        			grid_ret[i][j] = grid[i][j];
        		}
        	}
        	grid_ret[i][n - 1] = grid[i][n - 1];
        }
        grid_ret[n - 1] = grid[n - 1];
        return grid_ret;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[][] grid = new String[n][n];
        for(int grid_i = 0; grid_i < n; grid_i++) {
            grid[grid_i] = in.next().split("");
        }
        String[][] result = cavityMap(grid, n);
        for (int i = 0; i < result.length; i++) {
        	for (int j = 0; j < result.length; j++) {
        		System.out.print(result[i][j] + (j == result.length - 1 ? "\n" : ""));
        	}
        }
        System.out.println("");


        in.close();
    }
}
