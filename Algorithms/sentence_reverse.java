package Algorithms;

public class sentence_reverse {
    public static String reverseEachWord(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }
        String[] words = s.split(" ");
        StringBuilder reversed = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            reversed.append(reverse(words[i]));
            if (i != words.length - 1) {
                reversed.append(" ");
            }
        }
        return reversed.toString();
    }

    public static String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(reverseEachWord(s));
    }
}
