import java.util.*;

import javax.xml.bind.DatatypeConverter;

import java.security.*;

/**
 * Java MD5
 * Find the MD5 hash for a given string input
 * 
 * @author Nicolas QUINQUENEL
 */

public class Solution {

    public static void main(String[] args) throws NoSuchAlgorithmException {
		
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        
        //Find which algorithm we want to use (MD5 in our case)
        MessageDigest md = MessageDigest.getInstance("MD5");
        //Get the bytes from our input and update the message digest
        md.update(s.getBytes());
        //We generate the hash
        byte[] digest = md.digest();
        //Array of bytes to String (to the lower case)
        String myHash = DatatypeConverter.printHexBinary(digest).toLowerCase();
        System.out.println(myHash);
		
    }
}