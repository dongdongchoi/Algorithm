import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());
		int[][] arr = new int[cnt][2];
		
		for(int i=0; i< cnt;i++) {
			String line = br.readLine();
			StringTokenizer st =new StringTokenizer(line);
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		List<Integer>li = new ArrayList<>();
		for(int i =0; i<arr.length;i++) {
			int count = 1;
			for(int j=0; j<arr.length;j++) {
				if(arr[j][0]>arr[i][0]&&arr[j][1]>arr[i][1]) {
					count++;
				}
			}
			li.add(count); // 전체길이 - 자기자신 제외  -자기보다 작은애들
		}
		StringBuilder sb =new StringBuilder();
		for(int i =0; i< li.size();i++) {
			sb.append(li.get(i)+" ");
		}
		System.out.println(sb);
	}
}