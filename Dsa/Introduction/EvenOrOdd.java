
/*
J. Even or Odd
time limit per test
1 second
memory limit per test
256 megabytes

You are given an integer N. Your task is to determine whether the number is even or odd.
Input

A single integer N (1≤N≤109).
Output

    Even if N is even
    Odd if N is odd

Examples
Input
Copy

20

Output
Copy

Even

Input
Copy

3

Output
Copy

Odd



 */

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        System.out.print((N & 1) == 0 ? "Even" : "Odd");

        sc.close();
    }
}
