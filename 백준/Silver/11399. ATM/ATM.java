import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        
        // 두 번째 줄에서 숫자들을 읽기
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] aa = new int[a]; 
        
        for (int i = 0; i < a; i++) {
            aa[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(aa);
        int[]b = new int[aa.length];
        
        int ans = 0;
        for(int i=0;i<aa.length;i++) {
        	int temp = 0;
        	
        		for(int j=0;j<=i;j++) {
        			temp +=aa[j];
        		}
        		b[i]=temp;
        		ans+=b[i];
        	
        }
        
        
      System.out.println(ans);

    }
}