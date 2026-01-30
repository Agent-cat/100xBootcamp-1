import java.util.Scanner;

public class E_CountGoodNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();

            if ((x != 0 && 18 % x == 0) || x % 45 == 0) {
                count++;
            }
        }

        System.out.println(count);
        sc.close();
    }

}
