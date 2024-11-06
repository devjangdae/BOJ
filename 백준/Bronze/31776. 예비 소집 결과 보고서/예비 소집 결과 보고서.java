import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int cnt = 0;

        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int T1 = Integer.parseInt(st.nextToken());
            int T2 = Integer.parseInt(st.nextToken());
            int T3 = Integer.parseInt(st.nextToken());

            int sumT = T1 + T2 + T3;

            if(sumT == -3) {
                continue;
            }

            for(int j = 0; j < 3; j++) {
                if(T1 == -1) {
                    T1 = 121;
                } else if(T2 == -1) {
                    T2 = 121;
                } else if(T3 == -1) {
                    T3 = 121;
                }
            }

            if(T1 <= T2 && T2 <= T3) {
                    cnt += 1;
            }
        }
        System.out.println(cnt);
    }
}