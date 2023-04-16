package Algorithms.Array;

import java.util.Arrays;

public class binary_search {
    public static boolean binarySearch(int[] arr, int item) {
        int min = 0;
        int max = arr.length - 1;

        while (min <= max) {
            int mid = (max + min) / 2;
            if (item == arr[mid]) {
                return true;
            } else if (item < arr[mid]) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 8, 9 };
        System.out.println(binarySearch(arr, 5));
        System.out.println(binarySearch(arr, 6));

        Arrays.binarySearch(arr, 4);
    }
}