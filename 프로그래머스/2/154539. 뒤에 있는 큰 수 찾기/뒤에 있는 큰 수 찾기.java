import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
               Stack<Integer> st = new Stack<>();
        ArrayList<Integer> arr = new ArrayList<>();
        
        for (int i = numbers.length - 1; i >= 0; i--) {
            // 현재 숫자보다 큰 수를 찾기 위해 스택을 사용
            while (!st.isEmpty() && st.peek() <= numbers[i]) {
                st.pop(); // 현재 숫자보다 작거나 같은 수는 제거
            }
            // 스택이 비어있지 않으면 다음 큰 수를 찾은 것
            if (!st.isEmpty()) {
                arr.add(st.peek());
            } else {
                arr.add(-1); // 다음 큰 수가 없으면 -1 추가
            }
            // 현재 숫자를 스택에 추가
            st.push(numbers[i]);
        }
        Collections.reverse(arr);
         return arr.stream()
                  .mapToInt(Integer::intValue) // Integer를 int로 변환
                  .toArray();
    }
       
    }
