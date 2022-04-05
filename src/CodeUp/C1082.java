package CodeUp;//codeup 1082
import java.util.Scanner;

public class C1082 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

            int c = scan.nextInt(16);

        for(int i = 1; i < 16; i++) {
            System.out.printf("%X*%X=%X\n", c, i, c * i);
        }

    }
}
