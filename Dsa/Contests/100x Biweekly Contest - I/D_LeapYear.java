import java.util.Scanner;

public class D_LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if (N % 100 == 0) {
            if (N % 400 == 0) {
                System.out.println("Yes");
            }
        } else if (N % 4 == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        sc.close();
    }
}
