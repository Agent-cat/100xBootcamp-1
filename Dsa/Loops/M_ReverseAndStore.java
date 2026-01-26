import java.util.Scanner;

public class M_ReverseAndStore {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long N = sc.nextLong();
        long reverse = 0;
        while (N != 0) {
            reverse = reverse * 10 + N % 10;
            N = N / 10;
        }
        System.out.println(reverse);
        sc.close();
    }

}
