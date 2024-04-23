public class Main {
    public static String reverseWords(String s) {
        if (s == null || s.length() == 0)
            return "";

        String[] words = s.split("\\s+");
        StringBuilder reversedString = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversedString.append(words[i]);
            if (i != 0)
                reversedString.append(" ");
        }

        return reversedString.toString();
    }

    public static void main(String[] args) {
        String input = "The quick brown fox";
        String reversed = reverseWords(input);
        System.out.println("Reversed string: " + reversed);
    }
}