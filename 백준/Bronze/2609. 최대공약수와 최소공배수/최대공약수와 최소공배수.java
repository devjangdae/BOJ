import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int maxGcd = -1;

        // Greatest Common Divisor (GCD) 최대공약수
        // ex) 32 : 1 2 4 8 16 32
        //     40 : 1 2 4 5 8 10 20 40
        //     maxGcd = 8
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                for (int j = 1; j <= b; j++) {
                    if (b % j == 0) {
                        if (i == j) {
                            if (maxGcd < i) {
                                maxGcd = i;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(maxGcd);

        // Least Common Multiple (LCM) 최소공배수
        if (a > b) {
            System.out.println((a / maxGcd) * b);
        } else {
            System.out.println((b / maxGcd) * a);
        }
    }
}