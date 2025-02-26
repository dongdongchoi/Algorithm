import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main { // 풍선터뜨리기
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()); // 숫자의 개수 읽기
		
		StringBuilder sb = new StringBuilder();
		Deque<int[]> d = new ArrayDeque<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		sb.append("1 ");
		
		int m = Integer.parseInt(st.nextToken());
		
		for (int i = 2; i <= n; i++) {
			d.add(new int[] {i,Integer.parseInt(st.nextToken())});
		}
		
		while(!d.isEmpty()) {
			if(m>0) {
				for(int j =1;j<m;j++) {
					d.addLast(d.pollFirst());	
				}				
			
			int []n1 = d.pollFirst();
			m=n1[1];
			sb.append(n1[0]).append(" ");
			}
			else {
				for(int k=m;k<-1;k++) {
					d.addFirst(d.pollLast());	
				}
				int[]n1 = d.pollLast();
				m = n1[1];
				sb.append(n1[0]).append(" ");
				
			}
		}
		
		System.out.println(sb);
		
	}

}
