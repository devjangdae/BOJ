import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int num = 0;
        int cnt = 0;

        while(true) {
            num++;
            String str = String.valueOf(num);
            if(str.contains("666")){
                cnt++;
                if(cnt == N){
                    System.out.println(str);
                    break;
                }
            }
        }
    }
}