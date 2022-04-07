package CodeUp.Loop;
import java.util.Scanner;

public class C1354 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        for(int i = 1; i <= n; i++) {
            for(int j = n; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
