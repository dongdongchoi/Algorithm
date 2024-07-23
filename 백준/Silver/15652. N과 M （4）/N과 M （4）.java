import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static int n;	// 1부터 n까지
    public static int m;	// m개 추출
    public static int[] arr;
    public static boolean[] visit;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());


        n = Integer.parseInt(st.nextToken()); // 1부터 n까지
        m = Integer.parseInt(st.nextToken()); // m개 추출

        arr = new int[m];
        dfs(0,0);
        System.out.println(sb);


    }

    public static void dfs(int r, int t){
        if(r == m){ // 0번쨰 깊이부터 하나씩 증가해서 입력받은 m이랑 동일해질때 결과 출력
            for( int key : arr){
                sb.append(key).append(' ');
            }
            sb.append('\n');
            return;
        }

        for(int i=t; i<n;i++){

            arr[r] = i+1;
            dfs(r+1, i);

        }


    }
}