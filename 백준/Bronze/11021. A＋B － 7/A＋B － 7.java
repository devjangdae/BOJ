import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            System.out.println("Case #" + i + ": "
                    + (Integer.parseInt(st.nextToken())
                    + Integer.parseInt(st.nextToken())));
        }
    }
}