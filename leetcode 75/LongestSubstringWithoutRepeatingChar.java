/*
Given a string s, find the length of the longest 
substring
 without repeating characters.

 

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
*/

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		String str=null;
		int maxLen=0;
		String s = "abbcdd";
	Map<Character,Integer> mp=new LinkedHashMap<Character,Integer>();
	char arr[] =s.toCharArray();
	for(int i=0;i<arr.length;i++){
	    char ch=arr[i];
	    if(!mp.containsKey(ch)){
	        mp.put(ch,i);
	    }else{
	        i=mp.get(ch);
	        mp.clear();
	    }
	    
	    if(mp.size()>maxLen){
	        maxLen=mp.size();
	        
	    }
	}
		System.out.println(maxLen);
	}
}