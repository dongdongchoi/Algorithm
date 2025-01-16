import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        
        ArrayList<Integer>answer = new ArrayList<>();
        for(int i = 0; i<commands.length;i++) {
			ArrayList<Integer>arr = new ArrayList<>();
			for(int j = commands[i][0]-1;j<commands[i][1];j++) {
				arr.add(array[j]);

			}
			Collections.sort(arr);
			System.out.println(arr);
			answer.add(arr.get(commands[i][2]-1));
		}

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}