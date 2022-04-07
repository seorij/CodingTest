package CodeUp.Array;
import java.util.Scanner;

public class C1403 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] a = new int[100];
        int k = scan.nextInt();

        for(int i = 0; i < k; i++) {
            a[i] = scan.nextInt();
        }

        for(int i = 0; i < 2; i++)
            for(int j = 0; j < k; j++) {
                System.out.println(a[j]);
            }
    }
}
