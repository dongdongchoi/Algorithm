import java.util.*;
class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        
        for(int j = 0; j<citations.length -1; j++){
            for(int i =0; i<citations.length-1;i++){
            
            if(citations[i]>citations[i+1]){
                int temp = citations[i];
                citations[i] = citations[i+1];
                citations[i+1] = temp;
            }
        }
        }
        int length = citations.length;
        
        
        for(int i =0; i< citations.length;i++){
            if(citations[i]>=length - i){
                System.out.println(i);
                answer = length - i;
                break;
            }
        }
       
        return answer;
    }
}