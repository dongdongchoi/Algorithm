import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        
        List<Integer> answer = new ArrayList<>();
        
        for(int i=0; i<commands.length;i++){
            int first = commands[i][0]; //2
            int last = commands[i][1];  //5
            int target = commands[i][2]; //3
            
            int[] temp = new int[last - first +1];
            int cnt =0;
            for(int j = 0; j<array.length;j++){
                
                if(j >= first-1 && j<=last -1){
                    temp[cnt++] = array[j];
                }    
            }

            Arrays.sort(temp);
            for(int k=0; k<temp.length;k++){
                if(k==target-1){
                    answer.add(temp[k]);
                }
            }
        }
        
        
        return answer.stream().mapToInt(i->i).toArray();
    }
}