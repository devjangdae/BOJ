import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] scores = new int[8];
        int[] sortedScores = new int[8];

        for (int i = 0; i < 8; i++) {
            scores[i] = Integer.parseInt(br.readLine());
            sortedScores[i] = scores[i];
        }

        // 점수를 기준으로 내림차순 정렬
        Arrays.sort(sortedScores);

        int sum = 0;
        for (int i = 3; i < 8; i++) {
            sum += sortedScores[i];
        }

        System.out.println(sum);

        for (int i = 0; i < 8; i++) {
            // 원본 배열에서 상위 5개 점수의 인덱스 찾기
            if (scores[i] >= sortedScores[3]) {
                System.out.print((i + 1) + " ");
            }
        }
    }
}
