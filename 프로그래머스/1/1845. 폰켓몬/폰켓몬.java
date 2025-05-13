import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = nums.length/2;
        HashMap<Integer,Integer>ha = new HashMap<>();
        for(int i =0; i<nums.length;i++){
            if(ha.containsKey(nums[i])){
                ha.put(nums[i],ha.get(nums[i])+1);    
            }
            else{
                ha.put(nums[i],1);
            }
            
        }
        System.out.println(ha);
        
        int ans2 = ha.size();
        if(ans2<answer){
            answer = ans2;
        }
        return answer;
    }
}