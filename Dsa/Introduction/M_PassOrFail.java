/*

M. Pass or Fail
time limit per test
1 second
memory limit per test
256 megabytes

You are given the marks obtained by a student. Your task is to check whether the student has passed or failed.

A student is considered to have passed if the marks obtained are at least 35.
Input

A single integer marks (0≤marks≤100).
Output

Print:

    Pass if the student has passed
    Fail otherwise

Examples
Input
Copy

36

Output
Copy

Pass

Input
Copy

20

Output
Copy

Fail

 */

import java.util.Scanner;

public class M_PassOrFail {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println((N >= 35) ? "Pass" : "Fail");
        sc.close();
    }
}
