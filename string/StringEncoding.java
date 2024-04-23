public class Main {
    public static String reverseWords(String s) {
        if (s == null || s.length() == 0)
            return "";

        
        StringBuilder sb = new StringBuilder();
       int count=1;
        for (int i =1;i<=s.length();i++) {
            if(i == s.length() || s.charAt(i)!=s.charAt(i-1)){
                sb.append(s.charAt(i-1));
                sb.append(count);
                count=1;
            }
            else count++;
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String input = "abbbccde";
        String reversed = reverseWords(input);
        System.out.println("Reversed string: " + reversed);
    }
}