package DynamicPrograming;

//- To convert a recursion into dp we need to follow 3 steps
// 1 -> declare a dp array of n+1 size
// 2 -> store the returned  answer of the sub problem in the array
// 3 -> check if the value is allready calculated of not if calculated return the  stored value

import java.util.Scanner;

public class Febonacci {
    public static int feb(int n, int[] arr) {
        if (n <= 1)
            return n;
        if (arr[n] != 0) // Step - 3
            return arr[n];
        return arr[n] = feb(n - 1, arr) + feb(n - 2, arr); // Step - 2
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n + 1]; // Step - 1
        System.out.println(feb(n, arr));
        sc.close();
    }
}
