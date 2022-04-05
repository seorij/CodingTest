package CodeUp;

import java.util.Scanner;
public class roop5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] a = new int[10];

        for(int i = 0; i < 10; i++) {
            a[i] = scan.nextInt();
        }

        for(int i = 0; i < 10; i++) {
            if(a[i] % 5 == 0) {
                System.out.println(a[i]);
                break;
            }
            else if(i == 9) {
                System.out.println("0");
                break;
            }
        }

    }
}
