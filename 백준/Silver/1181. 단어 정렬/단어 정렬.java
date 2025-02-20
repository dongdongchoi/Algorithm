import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 숫자의 개수 읽기
        Set<String> s = new HashSet<>();
        
        
        for(int i =0; i<n;i++) {
        	s.add(br.readLine());
        }
        
       String[] arr = s.toArray(new String[0]);
       
       Arrays.sort(arr,new Comparator<String>() {
    	   public int compare(String a, String b){
    		   if(a.length() == b.length()) {
    			   return a.compareTo(b);
    		   }
    		   else {
    			   return a.length() - b.length();
    		   }
    	   }
       });
        
        
        for(String i : arr) {
        	System.out.println(i);
        }

        
    	}
    }
