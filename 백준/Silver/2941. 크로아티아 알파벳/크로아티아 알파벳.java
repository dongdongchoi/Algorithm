import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String [] arr = {"c=","c-","dz=","d-","lj","nj","s=","z="};
		String a = br.readLine();
		String b =a;
		for(int i=0; i<arr.length;i++) {
			if(a.contains(arr[i])) {
				b = b.replace(arr[i], "1");
			}
		}
		
		System.out.println(b.length());
	}

}