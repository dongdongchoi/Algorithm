import java.util.*;
import java.io.*;

class Main {
public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 숫자의 개수 읽기
        List<int[]> points = new ArrayList<>(); // 좌표를 저장할 리스트

        // 입력 받기
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            points.add(new int[]{x, y}); // 좌표를 리스트에 추가
        }

        // 정렬: 먼저 x값으로, x값이 같으면 y값으로 정렬
        Collections.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] != o2[0]) {
                    return Integer.compare(o1[0], o2[0]); // x값 비교
                } else {
                    return Integer.compare(o1[1], o2[1]); // y값 비교
                }
            }
        });

        // 결과 출력
        for (int[] point : points) {
            System.out.println(point[0] + " " + point[1]);
        }
    }
}