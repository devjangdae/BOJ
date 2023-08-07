import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String roomNum = br.readLine();
        int[] count = new int[10];

        for (int i = 0; i < roomNum.length(); i++) {
            char ch = roomNum.charAt(i);
            count[ch - '0']++;
        }

        // 6과 9의 개수 합치기
        int sixNineCount = count[6] + count[9];
        count[6] = (sixNineCount + 1) / 2; // 올림 처리
        count[9] = 0; // 9의 개수는 0으로 설정

        int max = 0;
        for (int i = 0; i < 10; i++) {
            if (count[i] > max) {
                max = count[i];
            }
        }

        System.out.println(max);
    }
}
