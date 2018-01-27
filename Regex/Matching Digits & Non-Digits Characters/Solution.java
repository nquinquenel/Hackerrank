/**
 * Matching Digits & Non-Digit Characters
 * 
 * @author Nicolas QUINQUENEL
 */

public class Solution {    

    public static void main(String[] args) {
        
        Regex_Test tester = new Regex_Test();
        // Pattern : xxXxxXxxxx (x digit X non digit)
        tester.checker("(\\d{2}\\D){2}\\d{4}"); // Use \\ instead of using \ 
    
    }
}