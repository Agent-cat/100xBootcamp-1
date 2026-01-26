package Patterns;

import java.util.Scanner;

public class Q_BinaryPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int start;
            if (i % 2 == 0) {
                start = 1;
            } else {
                start = 0;
            }
            for (int j = 1; j <= i; j++) {

                System.out.print(start % 2);
                // if (start == 0) {
                // start = 1;
                // } else {
                // start = 0;
                // } [OR]

                start++;

            }
            System.out.println();
        }
        sc.close();
    }
}
