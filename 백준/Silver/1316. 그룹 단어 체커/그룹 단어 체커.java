import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args)throws Exception {
		int a = Integer.parseInt(br.readLine());
		int cnt =0;
		for(int i= 0; i< a;i++) {
			if(check(br.readLine())==true) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
	
	public static boolean check(String a) {
		boolean [] b = new boolean[26];

		int pr = 0;
		for(int i = 0; i<a.length();i++) {
			if(a.charAt(i)!=pr) {
				if(b[a.charAt(i)-'a']==false) {
					b[a.charAt(i)-'a'] =true;
					pr = a.charAt(i);
				} else return false;
			}else continue;
		}
		return true;
	}
}