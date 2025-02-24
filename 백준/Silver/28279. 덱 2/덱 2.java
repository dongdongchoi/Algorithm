import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()); // 숫자의 개수 읽기
		Deque<Integer> deque = new ArrayDeque<>();
		
		for(int i= 0; i< n; i++) {
			String[]arr = br.readLine().split(" ");
			
			switch(Integer.parseInt(arr[0])) {
			 case 1: // 1 X: 정수 X를 덱의 앞에 넣는다.
                 deque.addFirst(Integer.parseInt(arr[1]));
                 break;
             case 2: // 2 X: 정수 X를 덱의 뒤에 넣는다.
                 deque.addLast(Integer.parseInt(arr[1]));
                 break;
             case 3: // 3: 덱의 맨 앞의 정수를 빼고 출력한다.
                 System.out.println(deque.isEmpty() ? -1 : deque.pollFirst());
                 break;
             case 4: // 4: 덱의 맨 뒤의 정수를 빼고 출력한다.
                 System.out.println(deque.isEmpty() ? -1 : deque.pollLast());
                 break;
             case 5: // 5: 덱에 들어있는 정수의 개수를 출력한다.
                 System.out.println(deque.size());
                 break;
             case 6: // 6: 덱이 비어있으면 1, 아니면 0을 출력한다.
                 System.out.println(deque.isEmpty() ? 1 : 0);
                 break;
             case 7: // 7: 덱의 맨 앞의 정수를 출력한다.
                 System.out.println(deque.isEmpty() ? -1 : deque.peekFirst());
                 break;
             case 8: // 8: 덱의 맨 뒤의 정수를 출력한다.
                 System.out.println(deque.isEmpty() ? -1 : deque.peekLast());
                 break;
			}
		}
		
		
    		

    	
    }
}