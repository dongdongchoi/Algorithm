import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());
        int[] arr = new int[num];
        
        for(int i = 0; i<num;i++) {
        	arr[i] = i+1;
        }
        
        int sum= 0;
        int cnt = 0;
        for(int i= 0;i<num;i++) {
        	sum = arr[i];
        	for(int j = i+1;  j< num; j++) {
        		sum += arr[j];
            	if(sum<num) {
            		continue;
            	}
            	else if(sum == num) {
            		cnt++;
            		break;
            		
            	}
            	else {
            		break;
            	}
            }
        }
       
        System.out.println(cnt+1);
	}
}
