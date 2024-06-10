import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());
        
        
        for(int i=0;i<num;i++) {
        	StringTokenizer st1 = new StringTokenizer(br.readLine());
        	int num2 = Integer.parseInt(st1.nextToken());
        	String str = st1.nextToken();
        	
        	for(int j=0;j<str.length();j++) {
        		for(int k=0;k<num2;k++) {
        			System.out.print(str.charAt(j));
        		}
        	}
        	System.out.println();
        }
        br.close(); 
	}
}