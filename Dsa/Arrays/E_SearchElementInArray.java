package Arrays;

import java.util.Scanner;

public class E_SearchElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int key = sc.nextInt();
        int flag = 0;
        for (int i = 0; i < N; i++) {
            if (sc.nextInt() == key)
                flag++;

        }
        if (flag > 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        sc.close();

    }
}
