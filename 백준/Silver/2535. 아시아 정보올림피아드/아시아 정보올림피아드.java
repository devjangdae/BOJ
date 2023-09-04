import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        int[] countries = new int[N];
        int[] ids = new int[N];
        int[] scores = new int[N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            countries[i] = Integer.parseInt(st.nextToken());
            ids[i] = Integer.parseInt(st.nextToken());
            scores[i] = Integer.parseInt(st.nextToken());
        }

        // 점수를 기준으로 인덱스를 정렬
        Integer[] indices = new Integer[N];
        for (int i = 0; i < N; i++) {
            indices[i] = i;
        }
        Arrays.sort(indices, (a, b) -> scores[b] - scores[a]);

        Map<Integer, Integer> medalCounts = new HashMap<>();
        int winnerCount = 0;

        for (int i = 0; i < N; i++) {
            int index = indices[i];
            int country = countries[index];
            medalCounts.put(country, medalCounts.getOrDefault(country, 0) + 1);

            if (medalCounts.get(country) <= 2) {
                System.out.println(country + " " + ids[index]);
                winnerCount++;
                if (winnerCount == 3) break;
            }
        }
    }
}
