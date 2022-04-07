package CodeUp.Loop;

import java.util.Scanner;

public class C1351 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int s = scan.nextInt();
        int l = scan.nextInt();

        for(int i = s; i <= l; i++) {
            for(int j = 1; j <= 9; j++) {
                System.out.printf("%d*%d=%d\n", i, j, i*j);
            }
        }
    }
}
