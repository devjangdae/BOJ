import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int ans = 0;
        for (int i = 1; i <= N; i++){
            for (int j = i; j<=N; j++) {
                if (i*j <= N) ans += 1;
            }
        }
        System.out.println(ans);
    }
}