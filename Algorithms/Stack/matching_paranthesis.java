package Algorithms.Stack;

public class matching_paranthesis {
    public static boolean hasMatchingParanthesis(String s) {
        int matchingSymbolTracker = 0;
        // Stack<Character> stk = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (current == '(') {
                // stk.push(current);
                matchingSymbolTracker++;
            } else if (current == ')') {
                // if (!stk.isEmpty()) {
                if (matchingSymbolTracker > 0) {
                    // stk.pop();
                    matchingSymbolTracker--;
                } else {
                    return false;
                }
            }
        }

        // return stk.isEmpty();
        return matchingSymbolTracker == 0;
    }

    public static void main(String[] args) {
        System.out.println(hasMatchingParanthesis("((algorithm()))"));
        // System.out.println(hasMatchingParanthesis("({algorithm()})"));
        // System.out.println(hasMatchingParanthesis("{(algorithm())}"));
        System.out.println(hasMatchingParanthesis("(algorithm())"));

        System.out.println();
        System.out.println(hasMatchingParanthesis("((algorithm((())())"));
        System.out.println(hasMatchingParanthesis("((algorithm((())"));
        // System.out.println(hasMatchingParanthesis("({algorithm())}"));

    }
}
