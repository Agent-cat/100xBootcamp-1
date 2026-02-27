package Arrays;

import java.util.Scanner;

public class J_ArrangeTheNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();

            for (int i = 1; i <= n; i++) {
                if (i % 2 == 1) {
                    System.out.print(i + " ");
                }
            }
            for (int i = n; i >= 1; i--) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
