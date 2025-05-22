import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());
		HashMap<Integer, Stack<Integer>> ha =new HashMap<>();
		
		for(int i=0; i< cnt;i++) {
			String line = br.readLine();
			StringTokenizer st =new StringTokenizer(line);
			int cowid = Integer.parseInt(st.nextToken());
			int location = Integer.parseInt(st.nextToken());
			
			if(ha.containsKey(cowid)) {
				if(ha.get(cowid).peek() !=location) {
					ha.get(cowid).push(location);
				}
			}
			else {
				Stack<Integer> sta = new Stack<>();
				sta.push(location);
				ha.put(cowid, sta);
			}
			
		
		}
		int ans = 0;
        
        for (Integer cowId : ha.keySet()) {
			 ans += ha.get(cowId).size()-1;

         }
		 
		System.out.println(ans);
		
		
	}
}
