package CodeUp.Array;
import java.util.Scanner;

public class C1405 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] a = new int[1000];
        int n = scan.nextInt();

        for(int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }

        for(int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print(a[j + i] + " ");

            }
            for(int j = 0; j < i; j++) {
                System.out.print(a[j] + " ");
            }
            System.out.println();
        }
    }
}
