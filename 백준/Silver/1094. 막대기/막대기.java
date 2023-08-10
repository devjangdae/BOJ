import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue; // 우선순위 큐를 사용하기 위해 import

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> sticks = new PriorityQueue<>(); // 작은 것부터 꺼낼 수 있는 우선순위 큐
        sticks.add(64);

        int sum = 64;

        while (sum > X) {
            int shortest = sticks.poll(); // 가장 짧은 막대를 꺼냄
            int half = shortest / 2;

            if (sum - half >= X) {
                sum -= half;
            } else {
                sticks.add(half); // 절반만 다시 추가
            }

            sticks.add(half); // 어떤 경우에도 다른 절반을 추가
        }

        System.out.println(sticks.size()); // 풀로 붙일 수 있는 막대의 개수
    }
}
