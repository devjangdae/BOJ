import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder result = new StringBuilder();

        int loop = Integer.parseInt(br.readLine());

        for (int i = 0; i < loop; i++) {
            st = new StringTokenizer(br.readLine());
            
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int sum = a+b;

            result.append(sum+"\n");
        }
        System.out.println(result);
    }
}
