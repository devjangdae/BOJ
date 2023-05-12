import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();

        long num = Long.parseLong(br.readLine());
        long sum = factorial(num);

        result.append(sum);
        System.out.println(result);
    }

    public static long factorial(long n) {
        if (n <= 1) {
            return 1;
        } else {
            return factorial(n - 1) * n;
        }
    }
}