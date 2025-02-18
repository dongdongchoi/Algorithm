import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 숫자의 개수 읽기
        int[][]arr = new int[n][2];
        
        for(int i =0; i< n;i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	arr[i][1] = Integer.parseInt(st.nextToken());
        	arr[i][0] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(arr,(o1,o2) ->{
        	if(o1[0] == o2[0]) {
        		return o1[1] - o2[1];
        	}
        	else {
        		return o1[0] - o2[0];
        	}
        });
        
        for(int i=0; i< n; i++) {
        	System.out.println(arr[i][1]+" "+arr[i][0]);
        }
        
	}
}