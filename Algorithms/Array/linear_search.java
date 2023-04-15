package Algorithms.Array;

public class linear_search {
    public static Integer linearsearch(int[] arr, int item) {
        for (int curr : arr) {
            if (curr == item) {
                return item;
            }
        }
        return -9999;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println(linearsearch(arr, 5));
        System.out.println(linearsearch(arr, 11));
    }
}
