import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> ha = new HashMap<>();
        for(int i =0; i< participant.length;i++){
            int cnt =1;
            if(ha.containsKey(participant[i])){
                ha.put(participant[i],ha.get(participant[i])+1);    
            }
            else{
                ha.put(participant[i],cnt);    
            }
            
        }
        
        for(int i =0; i<completion.length;i++){
            if(ha.containsKey(completion[i])){
                ha.put(completion[i],ha.get(completion[i])-1); 
            }
        }
        
        for(String key : ha.keySet()){
            if(ha.get(key)!=0){
                answer = key;
            }
        }
        
        return answer;
    }
}