/*
Given a string s, reverse only all the vowels in the string and return it.

The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

 

Example 1:

Input: s = "hello"
Output: "holle"
*/
class Solution {
    public String reverseVowels(String s) {
        char[] ch=s.toCharArray();
		int i=0;
		int j=s.length()-1;
		while(i<j){
		    
		    while(!isVowel(s.charAt(i)) && i<j)
		    i++;
		    
		    while(!isVowel(s.charAt(j)) && i<j)
		    j--;
		    
		    if(i<j){
		       char temp=ch[i];
		       ch[i]=ch[j];
		       ch[j]=temp;
		       i++;
		       j--;
		    }
		    
		    
		    
		}
		String str=new String(ch);
        return str;
    }
    public static boolean isVowel(char a){
	    char c=Character.toLowerCase(a);
	    if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
	    return true;
	    else
	    return false;
	}
}



//private static boolean isVowel(char c) {
//       return "aeiouAEIOU".indexOf(c) != -1;
//   }