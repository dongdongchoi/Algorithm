import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        
        int[] answer = new int[commands.length];
        int idx =0;
        for(int i =0; i<commands.length;i++)
        {
            ArrayList<Integer> list =  new ArrayList<>();;
            for(int j = commands[i][0];j<=commands[i][1];j++){
                list.add(array[j-1]);
            }
            Collections.sort(list);
            answer[idx] = list.get(commands[i][2]-1);
            idx++;
        }

        return answer;
    }
}