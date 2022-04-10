//K번째수
package Programmers;
import java.util.*;

public class sort1 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i = 0; i < commands.length; i++) {
            int[] temp = new int[commands[i][1]-(commands[i][0]-1)];
            for(int j = 0; j < temp.length; j++) {
                temp[j] = array[j+commands[i][0]-1]; //이게 왜 여기서 이러는지
            }
            Arrays.sort(temp);
            answer[i] = temp[commands[i][2]-1];
        }
        return answer;
    }
}
