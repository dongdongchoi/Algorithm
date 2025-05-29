import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        List<Integer>answer = new ArrayList<>();
        int [] a = {1,2,3,4,5};
        int [] b = {2,1,2,3,2,4,2,5};
        int [] c = {3,3,1,1,2,2,4,4,5,5};
        
        int sca = 0;
        int scb = 0;
        int scc = 0;
        
        for(int i =0; i<answers.length;i++){
            if(answers[i] == a[i%a.length]){
                sca++;
            }
            if(answers[i] == b[i%b.length]){
                scb++;
            }
            if(answers[i] == c[i%c.length]){
                scc++;
            }
        }
        int[]ab = new int[3];
        ab[0] = sca;
        ab[1] = scb;
        ab[2] = scc;
        int max = 0;
        for(int i = 0; i< ab.length;i++){
            if(ab[i] > max){
                max = ab[i];
            }
        }
        for(int i=0; i< ab.length;i++){
            if(max == ab[i]){
                answer.add(i+1);
            }
        }
        
        return answer.stream().mapToInt(i->i).toArray();
    }
}