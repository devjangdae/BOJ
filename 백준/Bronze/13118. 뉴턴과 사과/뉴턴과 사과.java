import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int[] personPosX = new int[st.countTokens()];
        for (int i = 0; i < personPosX.length; i++) {
            personPosX[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int applePosX = Integer.parseInt(st.nextToken());
        int applePosY = Integer.parseInt(st.nextToken()); //미사용
        int appleRadius = Integer.parseInt(st.nextToken());

        boolean zeroFlag = true;

        for (int i = 0; i < personPosX.length; i++) {
            if (personPosX[i] == applePosX) {
                System.out.println(i + 1); // 사람의 번호 출력
                zeroFlag = false;
                break;
            }
        }
        if (zeroFlag) {
            System.out.println(0);
        }
    }
}