/* 
Example 3:

Input: s = "a good   example"
Output: "example good a"
Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.
*/





public class ReverseWords {
    public static void main(String[] args) {
        String s = "  the sky   is blue  ";
        System.out.println(reverseWords(s)); // Output: "blue is sky the"
    }

    public static String reverseWords(String s) {
        // Trim the input string to remove leading and trailing spaces
        s = s.trim();
        
        // Split the string by spaces
        String[] words = s.split("\\s+");
        
        // Initialize a StringBuilder to build the result
        StringBuilder reversed = new StringBuilder();
        
        // Iterate over the words array in reverse order
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i != 0) {
                reversed.append(" ");
            }
        }
        
        return reversed.toString();
    }
}



//my approach
        // s=s.trim();
		
		// String[] words=s.split("\\s+");
		// String str="";
		// for(int i=words.length-1;i>=0;i--){
		//     str=str+words[i]+" ";
		// }
		// str=str.trim();