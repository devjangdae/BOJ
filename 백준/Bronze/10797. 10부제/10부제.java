import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int checkNum = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int count = 0;

        while(st.hasMoreTokens()){
            if(checkNum == Integer.parseInt(st.nextToken())){
                count++;
            }
        }

        System.out.println(count);
    }
}