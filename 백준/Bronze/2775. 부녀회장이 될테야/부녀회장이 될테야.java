import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());


        int[][] a = new int[15][15];


        for (int i = 0; i < a.length; i++) { // 0층 작업
            a[0][i] = i ;
        }
        for (int i = 1; i < a.length; i++) { // 1호 라인작업
            a[i][1] = 1;
        }
        for(int j =1; j<a.length;j++) {
            for(int k=1; k<a.length;k++) {
                a[j][k]=a[j][k-1]+a[j-1][k];
            }
        }
        
        for (int i = 0; i < T; i++) {
            int K = Integer.parseInt(br.readLine());
            int N = Integer.parseInt(br.readLine());



            System.out.println(a[K][N]);

        }

    }
}