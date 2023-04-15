package Algorithms.StringAlgorithm;

public class algo_driven_string {

    public static String reverse(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }
        // string are immutable
        // string builder it dynamically expands memory for accomodated string
        StringBuilder reversed = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed.append(s.charAt(i));
        }
        return reversed.toString();
    }

    public static String reverse2(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String s = "Hello";
        System.out.println(reverse(s));
        System.out.println(reverse2(s));
    }

}
