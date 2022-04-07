package CodeUp.Loop;
import java.util.Scanner;

public class C1378 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int sum = 0;

        for(int i = 1; i <= n; i++) {
            sum += (i*(i+1)) / 2;
        }
        System.out.print(sum);

    }
}
