import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        long devil = Long.parseLong(st.nextToken());
        long times = Long.parseLong(st.nextToken());
        long money = 0;

        if (times == 1){
            money = -1L;
        }else{
            money = (devil * times) / (times - 1L);

            if ((devil * times) % (times - 1L) != 0L){
                money += 1L;
            }
        }

        sb.append(money);
        System.out.println(sb.toString());
    }
}