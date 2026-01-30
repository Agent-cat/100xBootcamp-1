import java.util.Scanner;

public class B_IsVovel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        if (N.equals("a") || N.equals("e") || N.equals("i") ||
                N.equals("o") || N.equals("u")) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        sc.close();
    }
}
