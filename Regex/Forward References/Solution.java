/**
 * Forward References
 * 
 * @author Nicolas QUINQUENEL
 */

public class Solution {    

    public static void main(String[] args) {
        
        Regex_Test tester = new Regex_Test();
		// pattern : tic only if tac has appeared at least twice before
        tester.checker("^(\\2tic|(tac))+$"); // Use \\ instead of using \ 
    
    }
}