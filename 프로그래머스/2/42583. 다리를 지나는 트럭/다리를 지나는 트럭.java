import java.util.*; // re
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int time = 0;
        int sum = 0;
        Queue<Integer> q = new LinkedList<>();
        for(int i =0; i<truck_weights.length;i++){
            while (true){
                if(q.isEmpty()){
                    q.add(truck_weights[i]);
                    time++;
                    sum+=truck_weights[i];
                    break;
                } else if (q.size()==bridge_length) {
                    sum-=q.poll();
                }
                else {
                    if(sum+truck_weights[i]<=weight){
                        q.add(truck_weights[i]);
                        sum+=truck_weights[i];
                        time++;
                        break;
                    }
                    else{
                        q.add(0);
                        time++;
                    }
                }
            }
        }
        
        int answer = time+bridge_length;
        return answer;
    }
}