import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // k는 문자열의 길이, sz는 전체 문자열의 길이
        int k = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int sz = str.length();

        // 주어진 문자열을 k개씩 zigzag 패턴으로 분리하여 sb에 추가
        for (int row = 0; row < k; row++) {
            for (int col = 0; col < sz / k; col++) {
                int idx = (col % 2 == 0) ? col * k + row : col * k + k - 1 - row;
                sb.append(str.charAt(idx));
            }
        }

        System.out.println(sb);
    }
}
