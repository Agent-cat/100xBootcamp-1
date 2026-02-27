package Arrays;

import java.util.Scanner;

public class K_SwapAlternate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int arr[] = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            int i = 0;
            int j = 1;
            while (j < arr.length) {
                int tem = arr[i];
                arr[i] = arr[j];
                arr[j] = tem;
                i += 2;
                j += 2;
            }
            for (int j2 : arr) {
                System.out.print(j2 + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
