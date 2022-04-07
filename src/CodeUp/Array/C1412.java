package CodeUp.Array;
import java.util.Scanner;

public class C1412 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        char c;
        int n;

        for(int j = 97; j <= 122; j++) {
            n = 0;
            for (int i = 0; i < s.length(); i++) {
                c = s.charAt(i);
                if(c == j) {
                    n++;
                }
            }
            System.out.printf("%c:%d\n", j, n);
        }
    }
}
