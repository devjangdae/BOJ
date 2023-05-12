import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();

        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());

        if (x > 0 && y > 0 ) {
            result.append("1");
        } else if (x < 0 && y > 0 ) {
            result.append("2");
        } else if (x < 0 && y < 0 ) {
            result.append("3");
        } else if (x > 0 && y < 0 ) {
            result.append("4");
        }

        System.out.println(result.toString());
    }
}
