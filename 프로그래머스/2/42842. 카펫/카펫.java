class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int by = brown + yellow;
            
            for(int i = 3; i<=by; i++ ){
                if(by%i==0){
                    int y = by/i;
                    int x = by/y;
                    if((x-2)*(y-2) == yellow){
                        answer[0] = x;
                        answer[1] = y;
                    }
                }
            }
            
        return answer;
    }
}