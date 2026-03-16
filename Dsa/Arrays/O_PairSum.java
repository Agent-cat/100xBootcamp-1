package Arrays;

import java.util.Scanner;

public class O_PairSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();

            int arr1[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr1[i] = sc.nextInt();
            }
            int target = sc.nextInt();
            int freq = 0;
            for (int i = 0; i < arr1.length; i++) {
                for (int j = i + 1; j < arr1.length; j++) {
                    if (arr1[i] + arr1[j] == target) {
                        freq++;
                    }
                }
            }
            System.out.println(freq);
        }
        sc.close();
    }
}
// ===================================================================

/*
 * OPTIMAL
 * import java.util.*;
 * 
 * public class Main {
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * int t = sc.nextInt();
 * 
 * while (t-- > 0) {
 * int n = sc.nextInt();
 * int[] arr = new int[n];
 * 
 * for (int i = 0; i < n; i++) {
 * arr[i] = sc.nextInt();
 * }
 * 
 * int X = sc.nextInt();
 * 
 * HashMap<Integer, Integer> freq = new HashMap<>();
 * long count = 0;
 * 
 * for (int num : arr) {
 * int needed = X - num;
 * 
 * if (freq.containsKey(needed)) {
 * count += freq.get(needed);
 * }
 * 
 * freq.put(num, freq.getOrDefault(num, 0) + 1);
 * }
 * 
 * System.out.println(count);
 * }
 * 
 * sc.close();
 * }
 * }
 */
