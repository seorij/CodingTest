package CodeUp.Loop;//CodeUp 1088
import java.util.Scanner;

public class C1088 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();

        for(int i = 1; i < x+1; i++) {
            if(i != 0 && i % 3 == 0)
                continue;
            else
                System.out.print(i + " ");
        }

    }
}
