/*  For two strings s and t, we say "t divides s" if and only if s = t + t + t + ... + t + t (i.e., t is concatenated with itself one or more times).

Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.

*/

class Solution {
    public static String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        int gcdLength = gcd(str1.length(), str2.length());
        return str1.substring(0, gcdLength);
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}












// public class Main
// {
// 	public static void main(String[] args) {
		
//     String str1="ABCDE";
//     String str2="ABC";
//     int n=(str1.length()>str2.length())?str2.length():str1.length();
//     //System.out.println(n);
//     String str="";
//     for(int i=0;i<n;i++){
//         if(str1.charAt(i)==str2.charAt(i)){
//             str=str+String.valueOf(str1.charAt(i));
//         }
//     }
    
//    System.out.println(str); 
		
		
// 	}
// }