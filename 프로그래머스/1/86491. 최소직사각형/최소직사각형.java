class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        for(int i=0;i<sizes.length;i++){
                if(sizes[i][0]<sizes[i][1]){
                    int temp = sizes[i][0];
                    sizes[i][0] = sizes[i][1];
                    sizes[i][1] = temp;
                } 
        }
        
        int fir = 0;
        int sec = 0;
        for(int i=0; i<sizes.length;i++){
            if(sizes[i][0]>fir ){
                fir = sizes[i][0];
            }
            if(sizes[i][1]>sec){
                sec = sizes[i][1];
            }
            
        }
        answer = fir*sec;
        return answer;
    }
}