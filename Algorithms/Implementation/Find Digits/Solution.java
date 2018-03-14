
import java.util.*;

/**
 * Find Digits
 *
 * @author Nicolas QUINQUENEL
 */

public class Solution {

    static int findDigits(int n) {
        int ret = 0;
        int f = n;
        while (n > 0) {
            int digit = n % 10;
        	if (digit != 0 && f % digit == 0)
				ret++;
        	n = n / 10;
        }
        return ret;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            int n = in.nextInt();
            int result = findDigits(n);
            System.out.println(result);
        }
        in.close();
    }
}

