import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();

        int a = Integer.parseInt(br.readLine());
        //윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다.
        if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0) {
            result.append("1");
        } else {
            result.append("0");
        }

        System.out.println(result.toString());
    }
}
