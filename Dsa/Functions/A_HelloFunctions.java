package Functions;

import java.util.Scanner;

public class A_HelloFunctions {
    public static void pr(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("I am learning functions");

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pr(n);
        sc.close();

    }
}
