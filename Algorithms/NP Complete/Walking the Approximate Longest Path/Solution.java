import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Walking the Approximate Longest Path
 *
 * @author Nicolas QUINQUENEL
 */

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        double nbCity = in.nextInt();
        int nbRoad = in.nextInt();
        double nbCityTaken = 1;
        int currentCity = 0;
        double score = 0;
        List<Integer> listRet = new ArrayList<Integer>();
        List<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>((int)nbCity);
        List<Integer> listNbCity = new ArrayList<Integer>();
        
        for (int i = 0; i < nbRoad; i++) {
        	list.add(new ArrayList<Integer>());
        }
        
        while (nbRoad-- != 0) {
        	int i1 = in.nextInt();
        	int i2 = in.nextInt();
        	list.get(i1).add(i2);
        	list.get(i2).add(i1);
        }
        
        //Find city with lowest amount of roads
        int retTmp = Integer.MAX_VALUE;
        for (int i = 0; i < list.size(); i++) {
    		listNbCity.add(i, list.get(i).size());
    		if (list.get(i).size() > 0 && list.get(i).size() < retTmp) {
    			retTmp = list.get(i).size();
    			currentCity = i;
    		}
    	}
		listRet.add(currentCity);
		Solution.deleteCity(list, currentCity, listNbCity);
        
		//Find the solution
        while (score < 70) {
        	if (!list.get(currentCity).isEmpty()) {
        		currentCity = Solution.findSmallestNbCity(list, currentCity, listNbCity);
        		listRet.add(currentCity);
        		nbCityTaken++;
        		Solution.deleteCity(list, currentCity, listNbCity);
        	} else {
        		break;
        	}
        	
        	score = 5*(Math.ceil(Math.abs((Math.pow((nbCityTaken/nbCity), 2) * 100)/5)));
        }

        System.out.println(listRet.size());
        for (Integer e : listRet) {
        	System.out.print(e + " ");
        }
       
        in.close();
    }
    
    public static int findSmallestNbCity(List<ArrayList<Integer>> list, int city, List<Integer> listNbCity) {
		//Find smallest everytime
    	/*int ret = Integer.MAX_VALUE;
    	for (int i = 0; i < list.get(city).size(); i++) {
    		if (listNbCity.get(list.get(city).get(i)) < ret) ret = list.get(city).get(i);
    	}
    	return ret;*/
		//Find randomly
    	return list.get(city).get(ThreadLocalRandom.current().nextInt(0, list.get(city).size()));
    }
    
    public static void deleteCity(List<ArrayList<Integer>> list, int city, List<Integer> listNbCity) {
    	for (int i = 0; i < list.size(); i++) {
    		if (list.get(i).contains(city)) {
    			list.get(i).remove((Object)city);
        		int nb = listNbCity.get(i) - 1;
        		listNbCity.set(i, nb);
    		}
    	}
    }
}
