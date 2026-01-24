/*
You are given two integers N and M. Your task is to compute and print the results of the following operations:

    N+M
    N−M
    N×M
    N÷M (integer division)
    NmodM

Input

A single line containing two integers N and M (1≤N,M≤1000).
Output

Print five lines in the format as shown in the example.
Example
Input
Copy

6 4

Output
Copy

6 + 4 = 10
6 - 4 = 2
6 * 4 = 24
6 / 4 = 1
6 % 4 = 2


 */

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long a =sc.nextInt();
        long b =sc.nextInt();
        long add=a+b;
        long minus=a-b;
        System.out.println(a+" + "+b+" = "+ add);
        System.out.println();
        System.out.println(a+" - "+b+" = "+ minus);
         System.out.println();
        System.out.println(a+" * "+b+" = "+ a*b);
         System.out.println();
        System.out.println(a+" / "+b+" = "+ a/b);
         System.out.println();
        System.out.println(a+" % "+b+" = "+ a%b);
        sc.close();

    }

}
