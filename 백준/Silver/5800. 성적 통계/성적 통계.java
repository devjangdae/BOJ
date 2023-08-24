import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int K = Integer.parseInt(br.readLine());

        for (int i = 1; i <= K; i++) {
            st = new StringTokenizer(br.readLine());

            int N = Integer.parseInt(st.nextToken());

            int[] arr = new int[N];
            for (int j = 0; j < N; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr);

            //min max
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            for (int k = 0; k < N; k++) {
                if (arr[k] > max) {
                    max = arr[k];
                }
                if (arr[k] < min) {
                    min = arr[k];
                }
            }

            //gap
            int maxGap = Integer.MIN_VALUE;
            for (int k = 0; k < N - 1; k++) {
                int arrGap = Math.abs((arr[k] - arr[k + 1]));
                if (arrGap > maxGap) {
                    maxGap = arrGap;
                }
            }

            sb.append("Class " + i + "\n");
            sb.append("Max " + max + ", Min " + min + ", Largest gap " + maxGap + "\n");
        }
        System.out.println(sb);
    }
}