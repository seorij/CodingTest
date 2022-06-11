package Programmers;

import java.util.*;
//로또 최저순위와 최고순위

public class LV1_2 {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int count = 0;
        int lttn = 0;
        int[] rank = {6, 6, 5, 4, 3, 2, 1};

        Arrays.sort(lottos);
        Arrays.sort(win_nums);

        for(int i = 0; i < lottos.length; i++) {
            if(lottos[i] == 0)
                lttn++;
            for(int j = 0; j < win_nums.length; j++) {
                if(lottos[i] == win_nums[j]) {
                    count++;
                    break;
                }
            }
        }

        answer[0] = rank[lttn+count];
        answer[1] = rank[count];

        return answer;
    }
}
