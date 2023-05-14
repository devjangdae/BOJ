import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 첫째 줄에 정수의 개수 N(1 ≤ N ≤ 100)
        int loop = Integer.parseInt(br.readLine());

        // 둘째 줄에는 정수가 공백으로 구분
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < loop; i++) {
            arr.add(Integer.parseInt(st.nextToken()));
        }

        // 셋째 줄에는 찾으려고 하는 정수 v
        int v = Integer.parseInt(br.readLine());
        int sum = 0;

        for (int i = 0; i < loop; i++) {
            if (arr.get(i) == v) {
                sum += 1;
            }
        }

        // 첫째 줄에 입력으로 주어진 N개의 정수 중에 v가 몇 개인지 출력
        System.out.println(sum);
    }
}