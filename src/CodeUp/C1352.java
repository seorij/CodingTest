package CodeUp;
import java.util.Scanner;

public class C1352 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int c = scan.nextInt();

        for(int i = 0; i < c; i++) {
            for(int j = 0; j < c; j++) {
                System.out.print("*");
            }
            System.out.printf("\n");
        }
    }
}
