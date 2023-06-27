import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        // nCk = n! / ((n-k)! * k!)
        System.out.println(facto(N) / (facto(N - K) * facto(K)));
    }

    public static int facto(int a) {
        if (a <= 1) {
            return 1;
        }
        return a * facto(a - 1);
    }
}

