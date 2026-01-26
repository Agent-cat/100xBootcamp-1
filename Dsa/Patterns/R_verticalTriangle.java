/*
R. Vertical Traingle
time limit per test
1 second
memory limit per test
256 megabytes

You are given a positive integer

.

Print a triangle of

rows.
Input

The input contains a single integer
(

).
Output

Print the vertical triangle of stars, as shown in the example.
Examples
Input
Copy

4

Output
Copy

*
* *
* * *
* * * *
* * *
* *
*

Input
Copy

7

Output
Copy

*
* *
* * *
* * * *
* * * * *
* * * * * *
* * * * * * *
* * * * * *
* * * * *
* * * *
* * *
* *
*


 */

package Patterns;

import java.util.Scanner;

public class R_verticalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }
        sc.close();
    }
}
