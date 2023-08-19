import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int a = Integer.parseInt(br.readLine());
        char[] chars = br.readLine().toCharArray();

        int b = Integer.parseInt(String.valueOf(chars[0]));
        int c = Integer.parseInt(String.valueOf(chars[1]));
        int d = Integer.parseInt(String.valueOf(chars[2]));

        sb.append(a * d + "\n");
        sb.append(a * c + "\n");
        sb.append(a * b + "\n");
        sb.append(a * (d * 1) + a * (c * 10) + a * (b * 100));

        System.out.println(sb);
    }
}