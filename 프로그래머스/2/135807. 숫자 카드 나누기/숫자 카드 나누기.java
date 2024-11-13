import java.util.Arrays;
class Solution {
    public int solution(int[] arrayA, int[] arrayB) {
        int answer = 0;
        Arrays.sort(arrayA);
        Arrays.sort(arrayB);
        
        int result1 = findgcd(arrayA);
        int result2 = findgcd(arrayB);
        int check1 = check(arrayA,result2);
        int check2 = check(arrayB,result1);
        if(check1>=check2) {
        	answer = check1;
        }else {
            answer = check2;
        }
        
        return answer;
    }
    
    public static int gcd(int a, int b) {
	    if (b == 0)	return a;
	     else	return gcd(b, a % b);
	}
    
    public static int findgcd(int[] arr) {
        int result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            result = gcd(result, arr[i]);
            if (result == 1) {
                return 1;
            }
        }
        return result;
    }
    
    public static int check(int[]arr,int result) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%result==0) {
				return 0;
			}
		}
		return result;
	}
}