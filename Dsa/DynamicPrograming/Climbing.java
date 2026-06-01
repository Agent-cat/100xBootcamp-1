package DynamicPrograming;

import java.util.*;

class Climbing {
    // Function to count total ways to reach nth stair
    public static int climbStairs(int n, int[] arr) {
        // Base case
        if (n == 0)
            return 1;
        if (n == 1)
            return 1;

        if (arr[n] != 0)
            return arr[n];

        // Taking 1 step at a time
        int oneStep = climbStairs(n - 1, arr);

        // Taking 2 steps at a time
        int twoSteps = climbStairs(n - 2, arr);

        // Return total ways
        return arr[n] = oneStep + twoSteps;
    }

    public static void main(String[] args) {
        int n = 3;

        Climbing sol = new Climbing();
        int arr[] = new int[n + 1];

        // Print the answer
        System.out.println("The total number of ways: " + sol.climbStairs(n, arr));
    }
}
