import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder result = new StringBuilder();

        int a = Integer.parseInt(st.nextToken());

        if (a >= 90 && a <= 100 ) {
            result.append("A");
        } else if (a >= 80 && a < 90 ) {
            result.append("B");
        } else if (a >= 70 && a < 80 ) {
            result.append("C");
        } else if (a >= 60 && a < 70 ) {
            result.append("D");
        } else {
            result.append("F");
        }
        
        System.out.println(result.toString());
    }
}
