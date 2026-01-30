import java.util.Scanner;

public class G_CountZeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long N = sc.nextLong();
        int count = 0;
        while (N != 0) {
            if ((N & 1) == 0) {
                count++;
            }
            N = N >> 1;
        }
        System.out.println(count);

        sc.close();
    }
}
