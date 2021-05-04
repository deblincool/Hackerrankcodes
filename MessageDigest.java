/*MD5 (Message-Digest algorithm 5) is a widely-used cryptographic hash function with a -bit hash value. Here are some common uses for MD5:

To store a one-way hash of a password.
To provide some assurance that a transferred file has arrived intact.
MD5 is one in a series of message digest algorithms designed by Professor Ronald Rivest of MIT (Rivest, ); however, the security of MD5 has been severely compromised, most infamously by the Flame malware in . The CMU Software Engineering Institute essentially considers MD5 to be "cryptographically broken and unsuitable for further use".

Given an alphanumeric string, , denoting a password, compute and print its MD5 encryption value.

Input Format

A single alphanumeric string denoting .

Constraints

String  consists of English alphabetic letters (i.e.,  and/or decimal digits (i.e.,  through ) only.
Output Format

Print the MD5 encryption value of  on a new line.

Sample Input 0

HelloWorld
Sample Output 0

68e109f0f40ca72a15e05cc22786f8e6
Sample Input 1

Javarmi123
Sample Output 1

2da2d1e0ce7b4951a858ed2d547ef485

*/

import java.util.*;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
  
// Java program to calculate MD5 hash value
public class MD5 {
    public static String getMd5(String input)
    {
        try {
  
            // Static getInstance method is called with hashing MD5
            MessageDigest md = MessageDigest.getInstance("MD5");
  
            // digest() method is called to calculate message digest
            //  of an input digest() return array of byte
            byte[] messageDigest = md.digest(input.getBytes());
  
            // Convert byte array into signum representation
            BigInteger no = new BigInteger(1, messageDigest);
  
            // Convert message digest into hex value
            String hashtext = no.toString(16);
            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }
            return hashtext;
        } 
  
        // For specifying wrong message digest algorithms
        catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
  
    // Driver code
    public static void main(String args[]) throws NoSuchAlgorithmException
    {
        Scanner in = new Scanner(System.in);
        String s =in.nextLine();
        System.out.println(getMd5(s));
    }
}
