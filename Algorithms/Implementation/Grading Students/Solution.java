
import java.util.*;

/**
 * Grading Student
 *
 * @author Nicolas QUINQUENEL
 */

public class Solution {

    static int[] solve(int[] grades) {
    	int[] ret = new int[grades.length];
        for (int i = 0; i < grades.length; i++) {
        	//We check if the grade is 3 or less away from the next multiple of 5
        	//Also check for > 37 and not higher than 100
        	if (grades[i] % 5 > 2 && grades[i] >= 38 && grades[i] < 100) {
        		//We add the grade + how far he is from next multiple of 5
        		ret[i] = grades[i] + (5 - (grades[i] % 5));
        	} else {
        		ret[i] = grades[i];
        	}
        }
        return ret;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int grades_i=0; grades_i < n; grades_i++){
            grades[grades_i] = in.nextInt();
        }
        int[] result = solve(grades);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");
        

    }
}
