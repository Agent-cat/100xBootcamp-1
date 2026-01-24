/*

You are given the length and breadth of a rectangle. Your task is to calculate its area and perimeter.

The formulas are:

    Area = length × breadth
    Perimeter = 2×(length+breadth)

Input

A single line containing two integers length and breadth (1≤length,breadth≤1000).
Output

You are given the length and breadth of a rectangle. Your task is to calculate its area and perimeter.

The formulas are:

    Area = length × breadth
    Perimeter = 2×(length+breadth)

Example
Input
Copy

5 7

Output
Copy

Area = 35
Perimeter = 24


 */

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int length=sc.nextInt();
        int breadth=sc.nextInt();

        System.out.println("Area = "+ length*breadth);
        System.out.println("Perimeter = "+ 2*(length+breadth));
        sc.close();
    }
}
