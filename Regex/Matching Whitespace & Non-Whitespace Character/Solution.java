/**
 * Matching Whitespace & Non-Whitespace Character
 * 
 * @author Nicolas QUINQUENEL
 */

public class Solution {    

    public static void main(String[] args) {
        
        Regex_Test tester = new Regex_Test();
		// Pattern : XXxXXxXX (X non white space char x whitespace)
        tester.checker("(\\S{2}\\s){2}\\S{2}"); // Use \\ instead of using \ 
    
    }
}