import java.util.*;
class Solution {
    public int solution(int[] topping) {
        HashMap<Integer,Integer> hash1 = new HashMap<>();
        HashMap<Integer,Integer> hash2 = new HashMap<>();
        int answer = 0;
        for(int i = 0; i<topping.length;i++){
            hash1.put(topping[i],hash1.getOrDefault(topping[i],0)+1);
        }
        for(int i = 0; i<topping.length;i++){
            hash2.put(topping[i],hash2.getOrDefault(topping[i],0)+1);
            int cnt = hash1.get(topping[i]);
            if(cnt>0){
                hash1.put(topping[i],cnt-1);
            }
            
            if(hash1.get(topping[i])==0){
                hash1.remove(topping[i]);
            }
            
            if(hash1.size()==hash2.size()){
                answer++;
            }
        }
        
        
        return answer;
    }
}