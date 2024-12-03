import java.util.*;
class Solution {
    boolean solution(String s) {
       Stack<Character> stack = new Stack<>();
       boolean answer = true;
		for(int i = 0; i< s.length();i++) {
    		if(stack.size()==0) {
    			if(s.charAt(i)==')') {
    				answer = false;
    			}
    			else {
    				stack.add(s.charAt(i));
    			}
    		}
    		else {
    			if(s.charAt(i)==')' && stack.peek().equals('(')) {
    				stack.pop();
    			}
                else {
    				stack.push(s.charAt(i));
    			}
    		}

    	}
        
            	if(stack.size()!=0) {
    		answer = false;
    	}

        return answer;
    }
}


//class Solution {
//    boolean solution(String s) {
//        Stack<Character> stack = new Stack<>();
//        boolean answer = true;
//		for( int i = 0; i<s.length(); i++) {
//            if (s.charAt(i)=='(') {
//                stack.push(s.charAt(i));
//            } else if (s.charAt(i)==')') {
//                if (stack.size()==0 || stack.pop() != '(') {
//                    answer = false;
//                    break;
//                }
//            }
//        }
//        if (stack.size()!=0) {
//            answer = false;
//        }
//
//        return answer;
//    }
//}