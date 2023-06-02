import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "";

        int loop = Integer.parseInt(br.readLine()); // 5

        for (int T = 0; T < loop; T++) {
            str = br.readLine(); // OOXXOXXOOO
            char[] strArr = str.toCharArray();
            int score = 0;
            int circleCount = 0;

            for (char c : strArr) {
                if (c == 'O') {
                    score += circleCount + 1;
                    circleCount += 1;
                } else {
                    circleCount = 0;
                }
            }
            System.out.println(score);
        }
    }
}