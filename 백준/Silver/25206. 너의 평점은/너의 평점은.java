import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        Double[] arr1 = new Double[20];
        Double[] arr2 = new Double[20];
        int count = 0; // 유효한 입력 수를 세기 위한 변수
        
        for (int i = 0; i < 20; i++) {
            String line = br.readLine();
            if (line.isEmpty()) break; // 빈 줄이면 종료
            StringTokenizer st = new StringTokenizer(line);
            String ob = st.nextToken();
            arr1[i] = Double.parseDouble(st.nextToken());
            String grade = st.nextToken(); // 성적

            switch (grade) {
                case "A+":
                    arr2[i] = 4.5;
                    break;
                case "A0":
                    arr2[i] = 4.0;
                    break;
                case "B+":
                    arr2[i] = 3.5;
                    break;
                case "B0":
                    arr2[i] = 3.0;
                    break;
                case "C+":
                    arr2[i] = 2.5;
                    break;
                case "C0":
                    arr2[i] = 2.0;
                    break;
                case "D+":
                    arr2[i] = 1.5;
                    break;
                case "D0":
                    arr2[i] = 1.0;
                    break;
                case "F":
                    arr2[i] = 0.0; 
                    break;
            }
		}
		
		
		
		double sum = 0.0;
		double sum1 = 0.0;
		for(int i = 0; i<20;i++) {
			if(!arr1[i].equals("P")&&arr2[i]!=null) {
				sum+=arr1[i]*arr2[i];
				sum1 += arr1[i];

			}
		}
        
        if (sum == 0 && sum1 == 0) {
            System.out.printf("%.6f\n", 0.000000);
        } else {
            System.out.printf("%.6f\n", sum / sum1);
        }
    }
}
