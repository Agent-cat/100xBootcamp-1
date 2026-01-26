import java.util.Scanner;

public class K_Reverse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long N = sc.nextLong();
        while (N != 0) {
            System.out.print(N % 10);
            N = N / 10;
        }
        sc.close();
    }
}
