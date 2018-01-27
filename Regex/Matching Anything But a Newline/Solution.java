/**
 * Matching Anything But a Newline
 * 
 * @author Nicolas QUINQUENEL
 */

public class Solution {    

    public static void main(String[] args) {
        
        Tester tester = new Tester();
        /*
        * We try to match the following : aaa.aaa.aaa.aaa (where aaa can be any character but newline)
        * .{3} -> any character 3 times
        * \\.? -> dot none or at most one time (because it doesn't end with a dot)
        * {4} -> repeat 4 times
        */
        tester.check("(.{3}\\.?){4}"); 
    
    }
}