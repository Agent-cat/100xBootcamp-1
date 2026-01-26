/*
G. Hollow Rectangle
time limit per test
1 second
memory limit per test
256 megabytes

Given two integers n and m, print a hollow rectangle of dimensions n×m.
Input

The only line contains two integers n and m (1≤n,m≤100).
Output

Print the pattern.
Examples
Input
Copy

5 5

Output
Copy

*****
*   *
*   *
*   *
*****

Input
Copy

6 9

Output
Copy

*********
*       *
*       *
*       *
*       *
*********


 */
package Patterns;

import java.util.Scanner;

public class G_HolloRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {

                if (i == 1 || i == n || j == 1 || j == m) {

                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
        sc.close();
    }
}
