/**
 * Matching Word & Non-Word Character
 * 
 * @author Nicolas QUINQUENEL
 */

public class Solution {    

    public static void main(String[] args) {
        
        Regex_Test tester = new Regex_Test();
		// pattern : xxxXxxxxxxxxxxXxxx (x word X non word)
        tester.checker("\\w{3}\\W\\w{10}\\W\\w{3}"); // Use \\ instead of using \ 
    
    }
}