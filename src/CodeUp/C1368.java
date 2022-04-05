package CodeUp;
import java.util.Scanner;

public class C1368  {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int k = scan.nextInt();
        char d = scan.next().charAt(0);

        if(d == 'R') {
            for (int i = 1; i <= n; i++) {
                if (i < n) {
                    for (int j = 0; j < n-i; j++) {
                        System.out.print(" ");
                    }
                }
                for (int j = 0; j < k; j++)
                    System.out.print("*");
                System.out.println();
            }
        }
        else {
            for (int i = 1; i <= n; i++) {
                if (i > 1) {
                    for (int j = 0; j < i-1; j++) {
                        System.out.print(" ");
                    }
                }
                for (int j = 0; j < k; j++)
                    System.out.print("*");
                System.out.println();
            }
        }
    }
}
