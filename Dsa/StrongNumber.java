import java.util.Scanner;

public class StrongNumber {

    public static int fact(int n) {
        if (n <= 1)
            return 1;
        return n * fact(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int copy = n;
        int sum = 0;
        while (copy != 0) {
            int last = copy % 10;
            sum += fact(last);
            copy = copy / 10;
        }
        if (sum == n) {
            System.out.println("Strong Number");
        } else {
            System.out.println(" Not a strong Number");
        }
        sc.close();
    }
}
