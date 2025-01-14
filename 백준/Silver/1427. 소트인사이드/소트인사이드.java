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
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        String b = a+"";
        
		 char[]ca = b.toCharArray();
		 
		 String[] aa = new String[ca.length];
		 
		 for(int i =0; i< ca.length;i++) {
			 aa[i] = ca[i]+"";
		 }
		
		 Arrays.sort(aa, Collections.reverseOrder());
		 
		 String ans = "";
		 for(int i = 0; i<aa.length;i++) {
			 ans+=aa[i];
		 }
		 System.out.println(ans);
	}
}