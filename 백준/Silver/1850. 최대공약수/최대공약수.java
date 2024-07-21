import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        // Long.parseLong()을 사용하여 큰 숫자를 처리
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        long ans = gcd(a, b); // 최대공약수 계산
        for(int i =0;i<ans;i++) {
        	sb.append(1);
        }
        System.out.println(sb.toString());

    }

    // 최대공약수(GCD) 계산을 위한 유클리드 호제법
    private static long gcd(long x, long y) {
        while (y != 0) {
            long temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }
}