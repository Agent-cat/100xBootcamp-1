import java.util.Scanner;

public class SumofNum0toN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f = sc.nextInt();
        int l = sc.nextInt();

        int first = (f * (f + 1)) / 2;
        int last = (l - 1 * (l)) / 2;
        System.out.println(first - last);
        sc.close();
    }
}
