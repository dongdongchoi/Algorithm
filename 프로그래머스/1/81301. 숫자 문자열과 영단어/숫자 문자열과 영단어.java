import java.util.HashMap;
import java.util.Map;
class Solution {
    public int solution(String s) {
        // 숫자와 영단어 매핑
        Map<Integer, String> nn = new HashMap<>();
        nn.put(0, "zero");
        nn.put(1, "one");
        nn.put(2, "two");
        nn.put(3, "three");
        nn.put(4, "four");
        nn.put(5, "five");
        nn.put(6, "six");
        nn.put(7, "seven");
        nn.put(8, "eight");
        nn.put(9, "nine");

        String b = ""; // 현재 영단어를 저장할 변수
        StringBuilder answer = new StringBuilder(); // 최종 결과를 저장할 StringBuilder

        // 문자열을 문자 배열로 변환
        char[] cha = s.toCharArray();

        for (int i = 0; i < cha.length; i++) {
            b += cha[i]; // 현재 문자 추가
            for (Map.Entry<Integer, String> entry : nn.entrySet()) {
                if (entry.getValue().equals(b)) {
                    answer.append(entry.getKey()); // 일치하는 경우 숫자를 answer에 추가
                    b = ""; // b를 초기화하여 다음 단어를 위해 준비
                    continue; // 일치하는 경우 루프를 종료
                }else if(String.valueOf(entry.getKey()).equals(b)){
                    answer.append(entry.getKey());
                    b="";
                    continue;
                }
            }

        }
                    // 최종 결과를 정수로 변환하여 반환
        return Integer.parseInt(answer.toString());
    }
}
