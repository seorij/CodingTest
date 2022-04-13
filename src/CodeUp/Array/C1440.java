package CodeUp.Array;
import java.util.*;

public class C1440 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[100000];

        for(int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        for(int i = 0; i < n; i++) {
            System.out.print(i+1+": ");
            for (int j = 0; j < n; j++) {
                if(i != j) {
                    if (a[i] > a[j])
                        System.out.print("> ");
                    else if (a[i] < a[j])
                        System.out.print("< ");
                    else
                        System.out.print("= ");
                }
            }
            System.out.println(" ");
        }
    }
}
