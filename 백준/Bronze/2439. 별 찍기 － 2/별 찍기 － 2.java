import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            for (int j = N - 1; j > i; j--) {
                result.append(" ");
            }
            for (int k = 0; k <= i; k++) {
                result.append("*");
            }
            result.append("\n");
        }
        System.out.println(result);
    }
}
