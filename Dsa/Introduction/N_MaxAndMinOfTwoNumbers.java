/*
N. Max and Min of 2 Numbers
time limit per test
1 second
memory limit per test
256 megabytes

You are given two integers
and

. Your task is to find the minimum and maximum among them.
Input

A single line containing two integers
and

.
Output

Print two lines:

    Min = X
    Max = Y

where
is the minimum value and

is the maximum value.
Example
Input
Copy

12 9

Output
Copy

Min = 9
Max = 12

 */

import java.util.Scanner;

public class N_MaxAndMinOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        if (A > B) {
            System.out.println("Min = " + B);
            System.out.println("Max = " + A);
        } else {
            System.out.println("Min = " + A);
            System.out.println("Max = " + B);
        }

        sc.close();
    }
}
