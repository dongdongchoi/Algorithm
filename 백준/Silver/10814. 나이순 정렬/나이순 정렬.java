import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()); // 숫자의 개수 읽기
		String[][]arr = new String[n][3];

		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr[i][0] = st.nextToken();
			arr[i][1] = st.nextToken();
			arr[i][2] = String.valueOf(i);
		}

		Arrays.sort(arr, new Comparator<String[]>() {
			public int compare(String[] a, String[] b) {
				int a1 = Integer.parseInt(a[0]);
                int b1 = Integer.parseInt(b[0]);
                int a2 = Integer.parseInt(a[2]);
                int b2 = Integer.parseInt(b[2]);
                

                if (a1 == b1) {
                    return a2 - b2;
                } else {
                    return a1-b1; // 나이로 비교
                }
			}
		});

		for (String[] i : arr) {
			System.out.println(i[0] + " " + i[1]);
		}

	}
}
