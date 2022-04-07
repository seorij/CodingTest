package CodeUp.Loop;//CodeUp 1091
import java.util.Scanner;

public class C1091 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int m = scan.nextInt();
        int d = scan.nextInt();
        int n = scan.nextInt();

        int i;
        for(i = 1; i < n; i++) {
            a =  a * m + d;
        }
        System.out.print(a);
    }
}
