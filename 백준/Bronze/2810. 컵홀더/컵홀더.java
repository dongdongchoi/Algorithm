import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int human = Integer.parseInt(br.readLine());
        String a = br.readLine();
        String c = a.replaceAll("LL", "L");

        int cup = c.length() + 1;
        int answer = 0;
        if(cup<human) {
            answer = cup;
        }
        else {
            answer = human;
        }

        System.out.println(answer);
    }
}