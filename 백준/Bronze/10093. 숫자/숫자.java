import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        if(a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        if (a-b == 1 || a-b == 0) {
            System.out.println(0);
            return;
        }

        sb.append(b - a - 1 + "\n");

        for (int i = a + 1; i < b; i++) {
            sb.append(i + " ");
        }
        System.out.println(sb);
    }
}
