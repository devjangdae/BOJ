import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder result = new StringBuilder();

        int loop = Integer.parseInt(br.readLine());

        for (int i = 1 ; i <= loop; i++) {
            result.append(i).append("\n");
        }

        System.out.println(result);
    }
}