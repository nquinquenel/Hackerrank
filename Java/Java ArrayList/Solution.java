import java.util.*;

/**
 * Java ArrayList
 * 
 * @author Nicolas QUINQUENEL
 */

public class Solution {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        
        //Add values in the ArrayList
        int n = sc.nextInt();
        while (n-- != 0) {
        	ArrayList<Integer> subList = new ArrayList<Integer>();
        	int nb = sc.nextInt();
        	while (nb-- != 0) subList.add(sc.nextInt());
        	list.add(subList);
        }
        
        //Search for values
        n = sc.nextInt();
        while (n-- != 0) {
        	int x = sc.nextInt();
        	int y = sc.nextInt();
        	try {
                System.out.println(list.get(x - 1).get(y - 1));
            } catch (IndexOutOfBoundsException e) {
                System.out.println("ERROR!");
            }
        }
		
    }
}