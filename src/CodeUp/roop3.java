package CodeUp;

import java.util.Scanner;

public class roop3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int d = scan.nextInt();
        int n = scan.nextInt();

        int x = a + d * (n - 1);

        System.out.println(x);

    }

}
