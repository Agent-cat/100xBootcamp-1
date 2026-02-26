package Arrays;

import java.util.Scanner;

public class C_minEleAndItsPos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int min = Integer.MIN_VALUE;
        int minpos = 1;

        for (int i = 1; i <= N; i++) {
            int val = sc.nextInt();

            if (val > min) {
                min = val;
                minpos = i;
            }
        }

        System.out.println(min + " " + minpos);
        sc.close();
    }
}
