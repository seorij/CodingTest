package CodeUp.Array;
import java.util.Scanner;

public class C1411 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k;
        int[] a = new int[55];

        for(int i = 1; i <= n-1; i++) {
            k = sc.nextInt();
            a[k] = k;
        }

        for(int i = 1; i <= n; i++) {
            if(a[i] != i) {
                System.out.println(i);
                break;
            }
        }

    }
}
