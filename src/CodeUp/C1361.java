package CodeUp;
import java.util.Scanner;

public class C1361 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        for(int i = 1; i <= n; i++) {
            if(i != 1) {
                for (int j = 1; j <= i - 1; j++) {
                    System.out.print(" ");
                }
            }
            System.out.println("**");
        }
    }
}
