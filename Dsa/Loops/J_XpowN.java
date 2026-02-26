import java.util.Scanner;

public class J_XpowN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int N = sc.nextInt();

        long result = 1;
        for (int i = 0; i < N; i++) {
            result *= x;
        }

        System.out.println(result);
        sc.close();
    }
}
