import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        HashSet<Integer> arr = new HashSet<>(); 
		
		for(int i=0; i<numbers.length;i++) {
			for(int j=i+1; j<numbers.length;j++) {
				arr.add(numbers[i] + numbers[j]);
				
			}
		}
        int[] answer = new int[arr.size()];
        int tem = 0;
        for( int entry : arr) {
			answer[tem] = entry;
			tem++;
		}
        Arrays.sort(answer);
        return answer;
    }
}