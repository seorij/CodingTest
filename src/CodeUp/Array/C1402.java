package CodeUp.Array;
import java.util.Scanner;

public class C1402 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] a = new int[1000];

        for(int i = 1; i <= n; i++) {
            a[i] = scan.nextInt();
        }

        for(int i = n; i >= 1; i--) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
