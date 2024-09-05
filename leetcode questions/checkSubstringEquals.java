/*
Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

 

Example 1:

Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.
*/




public class StrStr {
    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";
        System.out.println(strStr(haystack, needle)); // Output: 0
    }

    public static int strStr(String haystack, String needle) {
        // Edge case: if needle is empty, return 0
        if (needle.length() == 0) {
            return 0;
        }

        // Iterate through the haystack up to the point where the remaining substring is at least as long as the needle
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            // Check if the substring of haystack starting at i matches the needle
            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                return i;
            }
        }

        // If needle is not found, return -1
        return -1;
    }
}
