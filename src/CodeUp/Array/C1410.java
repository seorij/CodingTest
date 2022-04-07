package CodeUp.Array;
import java.util.Scanner;

public class C1410 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int open = 0;
        int close = 0;

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '(')
                open++;
            else
                close++;
        }

        System.out.println(open + " " + close);
    }
}
