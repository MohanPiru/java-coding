/* You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.

Return the merged string.

 

Example 1:

Input: word1 = "abc", word2 = "pqr"
Output: "apbqcr"
*/


class Solution {
    public String mergeAlternately(String word1, String word2) {

       	String str="";

   int i=0;
        while(i<word1.length() || i<word2.length()){
            if(i<word1.length())
            str=str + String.valueOf(word1.charAt(i));
            
            if(i<word2.length())
            str=str + String.valueOf(word2.charAt(i));
            
            i++;
        }
        return str;

        
    }
}