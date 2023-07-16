import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[7];
        int minNum = Integer.MAX_VALUE;
        int sum = 0;

        for (int i = 0; i < 7; i++) {
            int a = Integer.parseInt(br.readLine());
            if (a % 2 != 0) {
                arr[i] = a;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        if (sum == 0) {
            System.out.println("-1");
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != 0 && minNum > arr[i]) {
                    minNum = arr[i];
                }
            }
            System.out.println(sum);
            System.out.println(minNum);
        }
    }
}

