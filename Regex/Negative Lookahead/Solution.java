/**
 * Negative Lookahead
 * 
 * @author Nicolas QUINQUENEL
 */

public class Solution {    

    public static void main(String[] args) {
        
        Regex_Test tester = new Regex_Test();
		// (?!\\1) references to (.)
        tester.checker("(.)(?!\\1)"); //Use '\\' instead of '\'.
    
    }
}