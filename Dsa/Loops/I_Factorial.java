import java.util.Scanner;

public class I_Factorial {
    public static long fact(int n) {
        if (n <= 1)
            return 1L;
        return n * fact(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fact(n));
        sc.close();
    }
}
