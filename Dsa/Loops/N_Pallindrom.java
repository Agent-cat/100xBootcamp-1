import java.util.Scanner;

public class N_Pallindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int original = N;

        long reverse = 0;
        while (N != 0) {
            reverse = reverse * 10 + (N % 10);
            N = N / 10;
        }

        if (original == reverse) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}
