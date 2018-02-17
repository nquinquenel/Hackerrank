
import java.util.*;

/**
 * Picking Numbers
 *
 * @author Nicolas QUINQUENEL
 */

public class Solution {

    static int pickingNumbers(int[] a) {
    	int ret = 0;
    	//We sort the array in order to avoid comparing with higher and lower numbers at the same time
    	Arrays.sort(a);
    	for (int i = 0; i < a.length-1; i++) {
    		int tmp = 1;
    		for (int j = i+1; j < a.length; j++)
    			if (Math.abs(a[i] - (a[j])) <= 1)
    				tmp++;
    		if (tmp > ret)
    			ret = tmp;
    	}
    	return ret;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int result = pickingNumbers(a);
        System.out.println(result);
        in.close();
    }
}

