/*
L. Multiple
time limit per test
1 second
memory limit per test
256 megabytes

You are given two integers
and  . Your task is to check whether   is a multiple of

.

A number
is said to be a multiple of   if   is divisible by

.
Input

A single line containing two integers
and

.
Output

Print:

    Yes if

is a multiple of

    No otherwise

Example
Input
Copy

6 36

Output
Copy

Yes


 */

import java.util.Scanner;

public class Multiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int F = sc.nextInt();
        System.out.println((F % N == 0) ? "Yes" : "No");
        sc.close();
    }

}
