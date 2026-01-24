/*
You are given two integers   and  . Your task is to check whether   is a factor of

.

A number
is said to be a factor of   if   is divisible by

.
Input

A single line containing two integers
and

.
Output

Print:

    Yes if

is a factor of

    No otherwise

Example
Input
Copy

36 6

Output
Copy

Yes


 */

import java.util.Scanner;

public class Factor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int F = sc.nextInt();
        System.out.println((N % F == 0) ? "Yes" : "No");
        sc.close();
    }

}
