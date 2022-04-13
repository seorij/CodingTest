package CodeUp.Array;

import java.util.*;

public class C1425 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int c = sc.nextInt();
        int[] a = new int[n];

        for(int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        Arrays.sort(a);

        for(int i = 0; i < n; i++) {
            if(i != 0 && i % c == 0)
                System.out.println();
            System.out.print(a[i] + "\t");
        }
    }
}
