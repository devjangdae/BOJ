import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long a = Long.parseLong(st.nextToken());
            long b = Long.parseLong(st.nextToken());
            long c = Long.parseLong(st.nextToken());

            long[] arr = {a, b, c};
            Arrays.sort(arr);

            if ((arr[0] == 0) && (arr[1] == 0) && (arr[2] == 0)) {
                break;
            }

            if (((arr[0] * arr[0]) + (arr[1] * arr[1])) == ((arr[2] * arr[2]))) { // 피타고라스 정리
                result.append("right\n");
            } else {
                result.append("wrong\n");
            }
        }
        System.out.println(result);
    }
}