import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int tokenCount = st.countTokens();

            String[] arr = new String[tokenCount];

            for (int j = 0; j < tokenCount; j++) {
                arr[j] = st.nextToken();
            }

            sb.append("Case #" + i + ": ");
            for (int k = tokenCount - 1; k >= 0; k--) {
                sb.append(arr[k] + " ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}

