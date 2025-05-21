import java.util.*;
class Solution {
    public String solution(int[] numbers) {
        
        String [] str = new String[numbers.length];
        for(int i =0; i< str.length;i++){
            str[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(str,(o1,o2) -> (o2+o1).compareTo(o1+o2));
        
        StringBuilder answer = new StringBuilder();
        if(str[0].equals("0")){
            return "0";
        }
        for(int i =0; i< str.length; i++){
            answer.append(str[i]);
        }
        
        return answer.toString();
    }
}