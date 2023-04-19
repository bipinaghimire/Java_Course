package Algorithms.Array;

import java.util.Arrays;

public class rotate_array {
    public static void rotateArrayLeft(int[] arr) {
        int temp = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            // 2->0,3=>1....
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = temp;
    }

    public static void rotateRight(int[] arr) {
        int temp = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        rotateArrayLeft(arr);
        Arrays.stream(arr).forEach(System.out::println);

        System.out.println("rotate right");
        rotateRight(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }
}
