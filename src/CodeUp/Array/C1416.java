package CodeUp.Array;
import java.util.Scanner;

public class C1416 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[255];
        int i;

        if(n == 0)
            System.out.println(n);

        for(i = 0; n != 0; i++) {

            a[i] = n % 2;
            n /= 2;
        }

        for(int j = i-1; j >= 0; j--) {
            System.out.print(a[j]);
        }
    }
}
