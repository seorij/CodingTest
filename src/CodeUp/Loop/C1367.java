package CodeUp.Loop;
import java.util.Scanner;

public class C1367  {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        for(int i = 1; i <= n; i++) {
            if(i < n) {
                for(int j = 0; j < n - i; j++)
                    System.out.print(" ");
            }
            for(int j = 0; j < n; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
