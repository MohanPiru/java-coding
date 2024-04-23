public class Main {
    public static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }

    public static String nextPalindrome(String S) {
        int num = Integer.parseInt(S) + 1;
        while (true) {
            String numStr = String.valueOf(num);
            if (isPalindrome(numStr))
                return numStr;
            num++;
        }
    }

    public static void main(String[] args) {
        String N = "1221";
        String nextPalin = nextPalindrome(N);
        System.out.println("Next smallest palindrome greater than " + N + " is: " + nextPalin);
    }
}
