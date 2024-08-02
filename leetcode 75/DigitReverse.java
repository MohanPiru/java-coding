public class ReverseInteger {
    public static void main(String[] args) {
        int x = 123;
        System.out.println(reverse(x)); // Output: 321
    }

    public static int reverse(int x) {
        int reversed = 0;

        while (x != 0) {
            int pop = x % 10; // Get the last digit
            x /= 10; // Remove the last digit from x

            // Check for overflow before updating reversed
            if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && pop > 7)) {
                return 0; // Overflow for positive numbers
            }
            if (reversed < Integer.MIN_VALUE / 10 || (reversed == Integer.MIN_VALUE / 10 && pop < -8)) {
                return 0; // Overflow for negative numbers
            }

            reversed = reversed * 10 + pop; // Append the digit
        }

        return reversed;
    }
}
