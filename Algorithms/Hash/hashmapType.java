package Algorithms.Hash;

import java.util.HashMap;
import java.util.Map;

public class hashmapType {
    public static void displayFrequency(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4 };
        displayFrequency(arr);

    }

}
