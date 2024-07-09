import java.util.*;
class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations);
        int answer = 0;
        int temp = 0;
        int inyong =0;
        
        for(int i=0; i<citations.length;i++){
            temp = citations[i];
            inyong = citations.length - i;
            
            if(temp>=inyong){
                answer = citations.length - i;
                break;
            }
        }
        
        return answer;
    }
}