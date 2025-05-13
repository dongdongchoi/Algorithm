import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        
        HashMap<String, Integer>ha = new HashMap<>();
        for(int i =0; i<clothes.length;i++){
            if(ha.containsKey(clothes[i][1])){
                ha.put(clothes[i][1],ha.get(clothes[i][1])+1);
            }
            else{
                ha.put(clothes[i][1],1);
            }
        }
        
        System.out.println(ha);
        
        for(String key : ha.keySet() ){
            answer *= ha.get(key)+1;                                
        }
        answer -= 1;
        return answer;
    }
}