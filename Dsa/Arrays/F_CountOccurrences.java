package Arrays;

import java.util.Scanner;

public class F_CountOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int key = sc.nextInt();
        int flag = 0;
        for (int i = 0; i < N; i++) {
            if (sc.nextInt() == key)
                flag++;

        }

        System.out.println(flag);

        sc.close();

    }
}
