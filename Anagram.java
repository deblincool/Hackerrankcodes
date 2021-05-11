/*Two strings,  and , are called anagrams if they contain all the same characters in the same frequencies. For this challenge, the test is not case-sensitive. For example, the anagrams of CAT are CAT, ACT, tac, TCA, aTC, and CtA.

Function Description

Complete the isAnagram function in the editor.

isAnagram has the following parameters:

string a: the first string
string b: the second string
Returns

boolean: If  and  are case-insensitive anagrams, return true. Otherwise, return false.
Input Format

The first line contains a string . 
The second line contains a string .

Constraints

Strings  and  consist of English alphabetic characters.
The comparison should NOT be case sensitive.
Sample Input 0

anagram
margana
Sample Output 0

Anagrams
Explanation 0

Character	Frequency: anagram	Frequency: margana
A or a	3	3
G or g	1	1
N or n	1	1
M or m	1	1
R or r	1	1
The two strings contain all the same letters in the same frequencies, so we print "Anagrams".

Sample Input 1

anagramm
marganaa
Sample Output 1

Not Anagrams
Explanation 1

Character	Frequency: anagramm	Frequency: marganaa
A or a	3	4
G or g	1	1
N or n	1	1
M or m	2	1
R or r	1	1
The two strings don't contain the same number of a's and m's, so we print "Not Anagrams".

Sample Input 2

Hello
hello
Sample Output 2

Anagrams
Explanation 2

Character	Frequency: Hello	Frequency: hello
E or e	1	1
H or h	1	1
L or l	2	2
O or o	1	1
The two strings contain all the same letters in the same frequencies, so we print "Anagrams".*/

import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        int i,j,f=0;
        int arr1[]=new int[100];
        int arr2[]=new int[100];
        for(i=65;i<=90;i++)
        {
            for(j=0;j<a.length();j++)
            {
                if((a.charAt(j)==(char)i)||(a.charAt(j)==(char)(i+32)))
                {
                    f=1;
                    arr1[i]=arr1[i]+1;
                }
                
            }
            if(f!=1)
            {
                arr1[i]=0;f=0;
            }    
        
        }f=0;
        for(i=65;i<=90;i++)
        {
            for(j=0;j<b.length();j++)
            {
                if((b.charAt(j)==(char)i)||(b.charAt(j)==(char)(i+32)))
                {
                    f=1;
                    arr2[i]=arr2[i]+1;
                }
                
            }
            if(f!=1)
            {
                arr2[i]=0;f=0;
            }    
        }f=0;
        for(i=65;i<=90;i++)
        {
            if(arr1[i]!=arr2[i])
            {
               f=1;
               break;
            }
        }if(f==1)
        return false;
        else
        return true;
             
                // Complete the function
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
