package Algorithms.StringAlgorithm;

public class string_algo {

    public static String normalizeString(String s) {
        return s.toLowerCase().trim().replace(",", ",");
    }

    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(normalizeString(s));
    }

}
