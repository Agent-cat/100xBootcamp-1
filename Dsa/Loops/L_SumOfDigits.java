import java.util.*;

public class L_SumOfDigits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long N = sc.nextLong();
        long sum = 0;
        while (N != 0) {
            sum = sum + (N % 10);
            N = N / 10;
        }
        System.out.print(sum);
        sc.close();
    }

}
