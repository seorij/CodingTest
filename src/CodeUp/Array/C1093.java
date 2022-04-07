package CodeUp.Array;
import java.util.Scanner;

public class C1093 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] a = new int[24];
        int n = scan.nextInt();
        int t;

        for(int i = 1; i <= n; i++) {
            t = scan.nextInt();
            a[t] = a[t]+1;
        }
        for(int i = 1; i <= 23; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
