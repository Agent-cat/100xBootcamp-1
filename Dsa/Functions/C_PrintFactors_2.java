package Functions;

import java.util.Scanner;

public class C_PrintFactors_2 {
    public static void facts(int n) {
        for (int i = n; i >= 1; i--) {
            if (n % i == 0)
                System.out.print(i + " ");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        facts(n);
        sc.close();
    }
}
