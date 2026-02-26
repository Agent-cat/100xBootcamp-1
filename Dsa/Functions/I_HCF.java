package Functions;

import java.util.Scanner;

public class I_HCF {
    public static int Hcf(int n, int m) {

        while (n != 0 && m != 0) {
            if (n > m)
                n = n % m;
            else if (m > n)
                m = m % n;
            else
                break;
        }

        if (n == 0)
            return m;
        else
            return n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.close();
        System.out.println(Hcf(n, m));

    }
}
