package CodeUp;
import java.util.Scanner;

public class C1380 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        for(int i = 1; i <= 6; i++) {
            for(int j = 1; j <= 6; j++) {
                if(i+j == n) {
                    System.out.println(i+" "+j);
                }
            }
        }
    }
}
