import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();
        char[] chrArr = str.toCharArray();

        Arrays.sort(chrArr);

        for (int i = chrArr.length - 1; i >= 0; i--) {
            sb.append(chrArr[i]);
        }
        System.out.println(sb);
    }
}

