import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();

        // 첫 번째 줄
        StringTokenizer st = new StringTokenizer(br.readLine());
        int loop = Integer.parseInt(st.nextToken()); // 미사용
        int minNum = Integer.parseInt(st.nextToken());

        // 두 번째 줄
        List<Integer> arr = new ArrayList<>();
        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");

        while (st2.hasMoreTokens()) {
            arr.add(Integer.parseInt(st2.nextToken())); // [1, 10, 4, 9, 2, 3, 8, 5, 7, 6]
        }

        for (int i = 0; i < arr.size(); i++) {
            if(arr.get(i) < minNum){
                result.append(arr.get(i)).append(" ");
            }
        }

        System.out.println(result);
    }
}