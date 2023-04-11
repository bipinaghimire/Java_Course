package Algorithms;

public class subset_string {
    // to work on each character
    public static void parseContent(String s) {
        System.out.println("Option");
        for (char c : s.toCharArray()) {
            System.out.println(c);
        }
        System.out.println();
        System.out.println("Option2");
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }
    }

    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(s.contains("LL"));
        parseContent(s);
    }
}
