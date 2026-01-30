
import java.util.Scanner;

public class A_HelloCodeforces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            System.out.println("Hello Codeforces " + i);
        }
        sc.close();
    }
}
