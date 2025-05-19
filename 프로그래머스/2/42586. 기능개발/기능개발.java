import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();
        Queue <Integer> q = new LinkedList<>();
        for(int i = 0; i< progresses.length;i++){
            int k =100;
            k =(k-progresses[i]) / speeds[i];
            if((100-progresses[i])%speeds[i]!=0){
                k +=1;
            }
            
            q.add(k);                
        }
        System.out.println(q);
        
        while(!q.isEmpty()){
            int cnt =0;
            int temp = q.poll();
            cnt++;
            while(!q.isEmpty() && q.peek()<=temp){
                q.poll();
                cnt++;    
            }
            
            answer.add(cnt);
        }
        return answer.stream().mapToInt(i->i).toArray();
    }
}