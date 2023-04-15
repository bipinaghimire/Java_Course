package Algorithms.StringAlgorithm;

public class string_search {
    public static boolean isAtEvenIndex(String s, char item) {
        if (s == null || s.isEmpty()) {
            return false;
        }
        for (int i = 0; i < s.length() / 2 + 1; i = i + 2) {
            if (s.charAt(i) == item && i % 2 == 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "HELLO";
        System.out.println(isAtEvenIndex(s, 'H'));
        System.out.println(isAtEvenIndex(s, 'T'));
        System.out.println(isAtEvenIndex(s, 'L'));
        System.out.println(isAtEvenIndex(s, 'H'));

    }
}
