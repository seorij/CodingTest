package CodeUp;
import java.util.Scanner;

public class C1366 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 0 || i == n - 1 || j == 1 || j == n || i == j -1 || j == n-i || j == n / 2 +1 || i == n/2) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
}
