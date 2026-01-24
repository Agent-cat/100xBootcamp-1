/*
I. Add Last Digits
time limit per test
1 second
memory limit per test
256 megabytes

You are given two integers
and  . Your task is to find the sum of the last digits of   and

.
Input

A single line containing two integers
and

.
Output

Print a single integer — the sum of the last digits of
and

.
Example
Input
Copy

169 125

Output
Copy

14



 */

import java.util.Scanner;

public class AddLastDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println((a % 10) + (b % 10));

        sc.close();
    }

}
