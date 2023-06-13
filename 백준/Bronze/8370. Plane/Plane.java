import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        // 비즈니스 클래스와 이코노미 클래스의 행 수와 열 수를 입력 받음
        int n1 = Integer.parseInt(st.nextToken()); // 비즈니스 클래스 행 수
        int k1 = Integer.parseInt(st.nextToken()); // 비즈니스 클래스 열 수
        int n2 = Integer.parseInt(st.nextToken()); // 이코노미 클래스 행 수
        int k2 = Integer.parseInt(st.nextToken()); // 이코노미 클래스 열 수

        // 각 클래스별 총 좌석 수 계산
        int totalSeats = (n1 * k1) + (n2 * k2); // 전체 좌석 수 계산

        // 결과 출력
        System.out.println(totalSeats);
    }
}