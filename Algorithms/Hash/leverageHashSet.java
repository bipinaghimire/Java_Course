package Algorithms.Hash;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class leverageHashSet {
    public static List<Integer> findMissingElements(int[] first, int[] second) {
        List<Integer> missingElement = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for (int i : second) {
            set.add(i);
        }
        for (int i : first) {
            if (!set.contains(i)) {
                missingElement.add(i);
            }
        }
        return missingElement;
    }

    public static void main(String[] args) {
        int[] first = { 1, 2, 3, 4, 5, 6, 7 };
        int[] second = { 1, 3, 5, 6, 7 };
        System.out.println(findMissingElements(first, second));

    }
}
