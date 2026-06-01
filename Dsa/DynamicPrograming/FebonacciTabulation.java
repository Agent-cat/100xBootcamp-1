package DynamicPrograming;

import java.util.Scanner;

public class FebonacciTabulation {
    public static int feb(int n) {
        int prev2 = 0;
        int prev1 = 1;
        int curi = 0;
        for (int i = 2; i < n; i++) {
            curi = prev1 + prev2;
            prev2 = prev1;
            prev1 = curi;

        }
        return prev1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(feb(n));
        sc.close();
    }
}
