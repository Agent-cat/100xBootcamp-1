package Arrays;

import java.util.*;

public class G_CheckIfArrayisSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n <= 1) {
            System.out.println("YES");
            sc.close();
            return;
        }

        int prev = sc.nextInt();

        for (int i = 1; i < n; i++) {
            int curr = sc.nextInt();
            if (prev > curr) {
                System.out.println("NO");
                sc.close();
                return;
            }
            prev = curr;
        }
        sc.close();

        System.out.println("YES");
    }
}
