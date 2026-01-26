/*
H. Triangle
time limit per test
1 second
memory limit per test
256 megabytes

You are given a positive integer n.

Print a triangle pattern consisting of n rows.
Input

The input contains a single integer n (1≤n≤2⋅103).
Output

Print n lines, as given in the example.
Examples
Input
Copy

5

Output
Copy

    *
   * *
  * * *
 * * * *
* * * * *

Input
Copy

3

Output
Copy

  *
 * *
* * *

 */
package Patterns;

import java.util.Scanner;

public class H_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
        sc.close();
    }
}
