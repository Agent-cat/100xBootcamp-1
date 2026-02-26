import java.util.Scanner;

public class K_Reverse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        StringBuilder rev = new StringBuilder(N);
        rev.reverse();
        System.out.println(rev.toString());
        sc.close();
    }

}
