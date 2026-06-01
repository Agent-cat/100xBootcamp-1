import java.util.Scanner;

public class FlipKthBit {
    public static int flip(int n, int k) {
        return n ^ (1 << k);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        System.out.println(flip(n, k));
        sc.close();

    }
}
