package Arrays;

import java.util.Scanner;

public class H_Sort01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while (T-- > 0) {

            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int k = 0; k < n; k++) {
                arr[k] = sc.nextInt();
            }

            int i = 0;
            int j = n - 1;

            while (i < j) {

                while (i < j && arr[i] == 0)
                    i++;

                while (i < j && arr[j] == 1)
                    j--;

                if (i < j) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    i++;
                    j--;
                }
            }

            for (int k = 0; k < n; k++) {
                System.out.print(arr[k] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
