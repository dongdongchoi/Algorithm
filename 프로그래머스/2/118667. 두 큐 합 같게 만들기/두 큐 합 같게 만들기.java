import java.util.*;
class Solution {
    public int solution(int[] queue1, int[] queue2) {
        int answer = -2;
        		Queue<Integer>qq1 = new LinkedList<>();
		Queue<Integer>qq2 = new LinkedList<>();
        
        long sum = 0;
		for(int i= 0; i<queue1.length;i++) {
			sum=sum+queue1[i]+queue2[i];
		}
		long half = sum/2;
		
		long sumq1 = 0;
		long sumq2 = 0;
		for( int i =0; i<queue1.length;i++) {
			qq1.add(queue1[i]);
			sumq1 +=queue1[i];

			qq2.add(queue2[i]);
			sumq2 +=queue2[i];			
		}
		int cnt =0;
		while(true) {
			if(sumq1>sumq2) {
				qq2.add(qq1.peek());
				sumq1 -=qq1.peek();
				sumq2 +=qq1.poll();
				cnt++;
			}
			else if(sumq2>sumq1) {
				qq1.add(qq2.peek());
				sumq2 -=qq2.peek();
				sumq1 +=qq2.poll();
				cnt++;
			}
			else if(sumq1 == sumq2){
				break;
			}
			
			if(cnt==queue1.length*3) {
				cnt = -1;

				break;
			}
		}
        answer = cnt;
        return answer;
    }
}