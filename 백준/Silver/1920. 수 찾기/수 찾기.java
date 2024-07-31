import java.util.*;
import java.io.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int a = Integer.parseInt(br.readLine());
        int[] arr = new int[a];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < a; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr); // 배열 정렬
        
        int b = Integer.parseInt(br.readLine());
        int[] arr2 = new int[b];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < b; i++) {
            arr2[i] = Integer.parseInt(st.nextToken());
        }

        // 두 번째 배열의 각 요소에 대해 binary 검색 수행
        for (int target : arr2) {
            binary(arr, target, sb);
        }
        
        // 결과 출력
        System.out.println(sb);
    }
    
    public static void binary(int[] arr, int target, StringBuilder sb) {
        int left = 0;
        int right = arr.length - 1;
        
        while (left <= right) {
            int mid = (left + right) / 2; // 중간 인덱스 계산
            if (arr[mid] == target) {
                sb.append(1).append("\n"); // 찾았을 경우 1 추가
                return; // 함수 종료
            } else if (arr[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        
        sb.append(0).append("\n"); // 찾지 못했을 경우 0 추가
    }
}