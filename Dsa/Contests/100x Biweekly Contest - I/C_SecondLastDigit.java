import java.util.Scanner;

public class C_SecondLastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        N /= 10;
        System.out.println(N %= 10);
        sc.close();
    }
}
