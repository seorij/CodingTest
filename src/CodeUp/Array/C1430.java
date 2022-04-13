package CodeUp.Array;

import java.util.*;

public class C1430 {
    static int[] b = new int[10000001];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int t;

        for(int i = 0; i < n; i++) {
            t = sc.nextInt();
            b[t] = 1;
        }

        int m = sc.nextInt();

        for(int i = 0; i < m; i++) {
            t = sc.nextInt();
            System.out.print(b[t] + "\t");
        }
    }
}

