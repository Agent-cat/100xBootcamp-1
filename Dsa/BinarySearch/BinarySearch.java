package BinarySearch;

import java.util.Scanner;

public class BinarySearch {
    // Search Iterative
    public static int SearchIterative(int[] arr, int k) {
        int n = arr.length;
        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == k)
                return mid;
            else if (arr[mid] > k)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }

    // SearchRecursive
    public static int SearchRecursive(int[] arr, int k, int low, int high) {
        if (low > high)
            return -1;

        int mid = low + (high - low) / 2;

        if (arr[mid] == k)
            return mid;
        else if (arr[mid] > k)
            return SearchRecursive(arr, k, low, mid - 1);
        else
            return SearchRecursive(arr, k, mid + 1, high);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 5, 7, 10, 24, 56 };
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        System.out.println(SearchIterative(arr, k));
        sc.close();
    }
}
