import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Long> stack = new Stack<>(); // push, pop, peek
        int N = Integer.parseInt(br.readLine());
        int sum = 0;

        for (int i = 0; i < N; i++) {
            long num = Long.parseLong(br.readLine());
            if (num != 0) {
                stack.push(num);
            } else {
                stack.pop();
            }
        }

        while(!stack.empty()){
            sum += stack.pop();
        }

        System.out.println(sum);
    }
}