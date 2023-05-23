import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));

        int n = Integer.parseInt(br.readLine());
        String numStr = br.readLine();
        int sum = 0;

        for (int i = 0; i < numStr.length(); i++) {
            sum += Integer.parseInt(String.valueOf(numStr.charAt(i)));
        }
        System.out.println(sum);
    }
}