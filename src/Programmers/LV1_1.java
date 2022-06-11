package Programmers;

import java.util.*;
//신고결과받기

public class LV1_1 {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = {};

        for(int i = 0; i < id_list.length; i++) {
            for(int j = 0; j < report.length; j++) {
                if(id_list[i].equals(report[j])) {
                    k++;
                }
                answer[i] = k;
                k = 0;
            }
        }
        return answer;
    }
}
