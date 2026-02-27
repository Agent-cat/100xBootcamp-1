package Arrays;

import java.util.HashMap;
import java.util.Scanner;

public class M_FindDuplicateNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            HashMap<Integer, Integer> m = new HashMap<>();
            for (int i = 0; i < N; i++) {
                int val = sc.nextInt();
                if (m.containsKey(val)) {
                    System.out.println(val);
                    break;
                }
                m.put(val, 1);
            }
        }
        sc.close();
    }
}

/*
 * while (T-- > 0) {
 * int N = sc.nextInt();
 * int sum = 0;
 * 
 * for (int i = 0; i < N; i++) {
 * sum += sc.nextInt();
 * }
 * 
 * int expected = (N - 2) * (N - 1) / 2;
 * System.out.println(sum - expected);
 * }
 */
