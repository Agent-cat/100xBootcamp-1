package Arrays;

import java.util.Scanner;

public class N_IntersectionOfArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int arr1[] = new int[n];
            for (int i = 0; i < arr1.length; i++) {
                arr1[i] = sc.nextInt();
            }
            int m = sc.nextInt();
            int arr2[] = new int[m];
            for (int i = 0; i < arr2.length; i++) {
                arr2[i] = sc.nextInt();
            }
            int visited[] = new int[m];
            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr2.length; j++) {
                    if (arr1[i] == arr2[j] && visited[j] == 0) {
                        System.out.print(arr1[i] + " ");
                        visited[j] = 1;
                        break;
                    }
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
