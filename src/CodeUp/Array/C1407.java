package CodeUp.Array;
import java.util.Scanner;

public class C1407 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String a = scan.nextLine();

        String result = a.replace(" ", "");
        System.out.println(result);

        //배열을 이용
        /*
        String[] arr = a.split(" ");
        for(int i = 0; i < arr.length; i++) {
               System.out.print(arr[i]);
               }
        */


    }
}
