import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> que = new PriorityQueue<>();
        
        // 배열 생성 offer - list의 add와 같이 추가 기능
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            que.offer(num);
        }

        int ans = 0;
        
        while (que.size() > 1) {
            int sum = que.poll() + que.poll(); // 가장 작은 두 묶음을 꺼내서 합침 10,20
            ans += sum;
            que.offer(sum); // 합친 묶음을 다시 큐에 넣음 30을 다시 큐에 넣어서 30과 40을 다시 더하게끔 
        }

        System.out.println(ans);
    }
}