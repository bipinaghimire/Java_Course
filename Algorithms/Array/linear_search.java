package Algorithms.Array;

import java.util.Arrays;
import java.util.OptionalInt;

public class linear_search {
    public static Integer linearsearch(int[] arr, int item) {
        for (int curr : arr) {
            if (curr == item) {
                return item;
            }
        }
        return -9999;
    }

    public static OptionalInt linearsearch2(int[] arr, int item) {
        return Arrays.stream(arr).filter(x -> x == item).findFirst();
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println(linearsearch(arr, 5));
        System.out.println(linearsearch(arr, 11));
        System.out.println(linearsearch2(arr, 0));
    }
}
