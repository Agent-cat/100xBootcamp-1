/*
B. M-Stars
time limit per test
1 second
memory limit per test
256 megabytes

You are given two integers n and m. Your task is to print a rectangle pattern consisting of n rows and m columns, where each cell contains a star '*'.
Input

The only line contains two integers n and m (1≤n,m≤200).
Output

Print the pattern.
Examples
Input
Copy

5 6

Output
Copy

******
******
******
******
******

Input
Copy

3 5

Output
Copy

*****
*****
*****

 */

package Patterns;

import java.util.Scanner;

public class B_MStars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("*");

            }
            System.out.println();

        }
        sc.close();
    }

}
