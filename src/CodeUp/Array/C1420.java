package CodeUp.Array;
import java.util.*;

public class C1420 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        char[][] a = new char[n][2];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < 2; j++) {
                a[i][j] = sc.next().charAt(i);
            }
        }
    }
}
