package CodeUp.Array;
import java.util.Scanner;

public class C1095 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] a = new int[10000];

        for(int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }

        int min = a[0];

        for(int i = 0; i < n; i++) {
            if(min > a[i])
                min = a[i];
        }
        System.out.println(min);
    }
}
