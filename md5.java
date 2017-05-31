import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;
import java.security.*;
import java.lang.Exception;
import javax.xml.bind.DatatypeConverter;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        //gets the STDIN from Hacker Rank
        String password = scan.nextLine();

        try{
            //MessageDigest is the class responsable for the MD5 hash
            MessageDigest md = MessageDigest.getInstance("MD5");
            //encrypts the string into md5 bytes
            md.update(password.getBytes());
            //gets the bytes
            byte[] digest = md.digest();

            //converts the bytes array into a string
            String hash = DatatypeConverter.printHexBinary(digest);

            System.out.println(hash.toLowerCase());
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}
