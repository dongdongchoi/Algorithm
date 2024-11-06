class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int x = gcd(n,m);
        int y = gcb(n,m);
        System.out.println("x : " + x);
        System.out.println("y : " + y);
        answer[0] = x;
        answer[1] = y;
        return answer;
    }
    public static int gcd(int a, int b){
        if(b==0) return a;
        else return gcd(b,a%b);
    }
    public static int gcb(int a, int b){
         return (a * b) / gcd(a, b);
    }
}