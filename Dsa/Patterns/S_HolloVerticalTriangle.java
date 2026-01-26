/*
S. Inverted Vertical Triangle
time limit per test
1 second
memory limit per test
256 megabytes

You are given a positive integer n.

Print a hollow triangle of 2n−1 rows.
Input

The input contains a single integer n (1≤n≤200).
Output

Print the inverted vertical triangle of stars, as shown in the example.
Examples
Input
Copy

5

Output
Copy

*
* *
*   *
*     *
*       *
*     *
*   *
* *
*

Input
Copy

3

Output
Copy

*
* *
*   *
* *
*

 */
package Patterns;

import java.util.Scanner;

public class S_HolloVerticalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == i || j == 1) {

                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                if (j == i || j == 1) {

                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
