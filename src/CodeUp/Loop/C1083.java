package CodeUp.Loop;//CodeUp 1083
import java.util.Scanner;

public class C1083 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();

        for(int i = 1; i < x + 1; i++) {
            if(i % 3 == 0 && i != 0)
                System.out.print(" X");
            else
             System.out.print(" " + i);
        }

    }
}
