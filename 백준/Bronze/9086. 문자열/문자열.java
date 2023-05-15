import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int loop = Integer.parseInt(br.readLine());
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < loop; i++) {
            String line = br.readLine();
            result.append(line.charAt(0)).append(line.charAt(line.length()-1));
            result.append("\n");
        }

        System.out.println(result);
    }
}