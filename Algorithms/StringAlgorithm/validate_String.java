package Algorithms.StringAlgorithm;

public class validate_String {
    public static boolean isPasswordComplex(String s) {
        return s.chars().anyMatch(Character::isUpperCase) &&
                s.chars().anyMatch(Character::isLowerCase) &&
                s.chars().anyMatch(Character::isDigit);
    }

    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(isPasswordComplex(s));
    }
}
