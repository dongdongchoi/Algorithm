import java.util.*;
class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        int h = 0;
        Arrays.sort(citations);
       for(int i=citations.length-1;i>=0;i--) {
			h++;
           if(citations[i]<h) {
				answer = h;
				break;
			}
			
		}
        if (answer == 0) {
            answer = h;
            return answer;
        }
        return answer-1;
    }
}