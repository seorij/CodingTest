package CodeUp.Loop;
import java.util.Scanner;

public class C1357 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        for(int i = 1; i <= 2*n; i++) {
            if(i <= n) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
            }
            else {
                for(int j = n - 1; j >= i-n; j--) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    }

