package CodeUp;
import java.util.Scanner;

public class C1358 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int c = (n - 1) / 2;

        for(int i = 1; i <= n; i+=2) {
            if(n%2 == 1) {
                for (int j = 1; j <= c; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
                c--;
            }
        }
    }
}
