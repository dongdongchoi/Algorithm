import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 숫자의 개수 읽기
        int[]arr = new int[n];
        Set<Integer> s = new HashSet<>();
    	StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i =0; i< n;i++) {

        	arr[i] = Integer.parseInt(st.nextToken());
        	s.add(arr[i]);
        }
        
        Integer[]arr2 = s.toArray(new Integer[0]);
        
        Arrays.sort(arr2);
          Map<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < arr2.length; i++) {
            indexMap.put(arr2[i], i);
        }

        // 결과를 저장할 StringBuilder
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < n; i++) {
            ans.append(indexMap.get(arr[i])).append(" ");
        }
        
        System.out.println(ans);

        
	}
}
