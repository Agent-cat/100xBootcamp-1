package Arrays;

import java.util.Scanner;

public class L_MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            // int arr[] = new int[N];
            int a = sc.nextInt();

            for (int i = 1; i < N; i++) {
                a = a ^ sc.nextInt();
            }
            System.out.println(a);
        }
        sc.close();
    }
}
