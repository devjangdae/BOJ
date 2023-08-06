import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][] dp = new int[30][30];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());

            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            sb.append(combi(M, N)).append("\n");
        }
        System.out.println(sb);
    }

    public static int combi(int n, int r) {
        // 이미 풀린 경우 바로 반환 dp memoization(메모이제이션)
        if (dp[n][r] > 0) {
            return dp[n][r];
        }

        // 2번 성질
        if (n == r || r == 0) {
            return dp[n][r] = 1;
        }

        // 1번 성질 nCr
        return dp[n][r] = combi(n - 1, r - 1) + combi(n - 1, r);
    }
}

