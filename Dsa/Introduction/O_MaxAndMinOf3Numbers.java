/*
O. Max and Min of 3 Numbers
time limit per test
1 second
memory limit per test
256 megabytes

You are given three integers
,  , and

. Your task is to find the minimum and maximum among them.
Input

A single line containing three integers
,  , and

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

12 9 15

Output
Copy

Min = 9
Max = 15



 */

import java.util.*;

public class O_MaxAndMinOf3Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int mn = Math.min(a, Math.min(b, c));
        int mx = Math.max(a, Math.max(b, c));

        System.out.println("Min = " + mn);
        System.out.println("Max = " + mx);
        sc.close();
    }

}
