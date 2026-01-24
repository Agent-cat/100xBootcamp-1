/*
P. Student Performance Evaluation
time limit per test
1 second
memory limit per test
256 megabytes

You are given the marks obtained by a student. Based on the marks, display an appropriate performance message according to the following rules:

    If marks are greater than 90

, print Excellent
Else if marks are greater than 80
and less than or equal to 90
, print Good
Else if marks are greater than 70
and less than or equal to 80
, print Fair
Else if marks are greater than 60
and less than or equal to 70
, print Meets Expectations
Else (marks less than or equal to 60

    ), print Below Par

Input

A single integer marks (0≤marks≤100)

.
Output

Print a single line containing the performance message corresponding to the given marks.
Examples
Input
Copy

85

Output
Copy

Good

Input
Copy

99

Output
Copy

Excellent
 */

import java.util.*;

public class Q_StudentPerformanceEvaluation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();

        if (marks > 90) {
            System.out.println("Excellent");
        } else if (marks > 80) {
            System.out.println("Good");
        } else if (marks > 70) {
            System.out.println("Fair");
        } else if (marks > 60) {
            System.out.println("Meets Expectations");
        } else {
            System.out.println("Below Par");
        }
        sc.close();
    }
}
