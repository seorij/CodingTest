package CodeUp;//codeup 1084
import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class C1084 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = bf.readLine();
        StringTokenizer st = new StringTokenizer(s);

        int r = Integer.parseInt(st.nextToken());
        int g = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int count = 0;

        for(int i = 0; i < r; i++) {
            for(int j = 0; j < g; j++) {
                for(int k = 0; k < b; k++) {
                    bw.write( i+ " " + j + " " + k + "\n") ;
                    count++;
                }
            }
        }
//        bw.write(String.valueOf(count));
        bw.flush();
        System.out.print(count);

    }
}
