import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        ArrayList<String>a = new ArrayList<>();
		
		for(int i=0; i<s.length();i++) {
			a.add(s.charAt(i)+"");
		}
		
		Collections.sort(a, Collections.reverseOrder());
		for(int i = 0; i<a.size();i++) {
			answer +=a.get(i);
		}
        return answer;
    }
}