import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        //주어진 카드개수 N
        int N = Integer.parseInt(br.readLine());

        //중복이 없으니 트리셋 사용
        TreeSet<Integer> ts = new TreeSet<>();

        //카드 리스트 초기화
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            ts.add(num);
        }

        //주어진 찾을 카드 개수 M
        int M = Integer.parseInt(br.readLine());

        //찾을 카드가 있는지 확인
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            int findNum = Integer.parseInt(st.nextToken());
            if (ts.contains(findNum)) {
                sb.append("1 ");
            } else {
                sb.append("0 ");
            }
        }

        //출력
        System.out.println(sb);
    }
}