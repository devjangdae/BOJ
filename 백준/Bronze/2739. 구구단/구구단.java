import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();

        int num = Integer.parseInt(br.readLine());

        for (int i = 1; i <= 9; i++) {
            result.append(num).append(" * ").append(i).append(" = ").append(num*i).append("\n");
        }

        System.out.println(result);
    }
}