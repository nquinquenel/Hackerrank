import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Matrix Layer Rotation
 *
 * @author Nicolas QUINQUENEL
 */

public class Solution {

	static void checkZeroes(int[][] m1, int[][] m2, int m, int n) {
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (m1[i][j] == 0)
					m1[i][j] = m2[i][j];
			}
		}
	}

	static void permut(int[][] newMatrix, int[][] matrix, int m, int n, int j) {
		//Top row
		for (int i = 1 + j; i < n - j; i++) {
			newMatrix[0+j][i-1] = matrix[0+j][i];
		}
		//Left column
		for (int i = 0 + j; i < m - 1 - j; i++) {
			newMatrix[i+1][0+j] = matrix[i][0+j];
		}
		//Bottom row
		for (int i = 0 + j; i < n - 1 - j; i++) {
			newMatrix[m-1-j][i+1] = matrix[m-1-j][i];
		}
		//Right column
		for (int i = 1 + j; i < m - j; i++) {
			newMatrix[i-1][n-1-j] = matrix[i][n-1-j];
		}
	}

	static void scale(int[][] newMatrix, int[][] matrix, int m, int n, int j) {
		//Top row
		for (int i = 1 + j; i < n - j; i++) {
			matrix[0+j][i-1] = newMatrix[0+j][i-1];
		}
		//Left column
		for (int i = 0 + j; i < m - 1 - j; i++) {
			matrix[i+1][0+j] = newMatrix[i+1][0+j];
		}
		//Bottom row
		for (int i = 0 + j; i < n - 1 - j; i++) {
			matrix[m-1-j][i+1] = newMatrix[m-1-j][i+1];
		}
		//Right column
		for (int i = 1 + j; i < m - j; i++) {
			matrix[i-1][n-1-j] = newMatrix[i-1][n-1-j];
		}
	}

	static void matrixRotation(int[][] matrix, int m, int n, int r) {
		int rTmp;
		int[][] newMatrix = new int[m][n];
		for (int j = 0; j < Math.min(m, n) / 2; j++) {
			rTmp = r % (((n - (j * 2)) * 2 + (m - (j * 2)) * 2) - 4);

			while (rTmp != 0) {
				Solution.permut(newMatrix, matrix, m, n, j);
				Solution.scale(newMatrix, matrix, m, n, j);

				rTmp--;
			}

			Solution.checkZeroes(newMatrix, matrix, m, n);
		}
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(newMatrix[i][j] + " ");
			}
			System.out.print("\n");
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		int n = in.nextInt();
		int r = in.nextInt();
		int[][] matrix = new int[m][n];
		for(int matrix_i = 0; matrix_i < m; matrix_i++){
			for(int matrix_j = 0; matrix_j < n; matrix_j++){
				matrix[matrix_i][matrix_j] = in.nextInt();
			}
		}
		matrixRotation(matrix, m, n, r);
		in.close();
	}
}
