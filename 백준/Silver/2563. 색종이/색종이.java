import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[][] board = new int[100][100];

        for (int i = 0; i < 100; i++) { // 초기화
            for (int j = 0; j < 100; j++) {
                board[i][j] = 0;
            }
        }

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int row = 100 - Integer.parseInt(st.nextToken());
            int col = Integer.parseInt(st.nextToken());

            for (int j = row; j > row - 10; j--) {
                for(int k = col; k < col + 10; k++){
                    board[j][k] = 1;
                }
            }
        }

        // 검은색 영역의 넓이를 계산
        int blackArea = 0;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if(board[i][j] == 1) {
                    blackArea++;
                }
            }
        }

        System.out.println(blackArea);
    }
}