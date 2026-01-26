/*

You are given a positive integer n.

Print an n×n square of stars.
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

*****
*****
*****
*****
*****

Input
Copy

2

Output
Copy

**
**

 */
package Patterns;

import java.util.Scanner;

public class E_Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
        sc.close();
    }
}
