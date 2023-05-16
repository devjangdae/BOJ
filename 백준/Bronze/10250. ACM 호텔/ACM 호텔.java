import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();

        int loop = Integer.parseInt(br.readLine());
        for (int i = 0; i < loop; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            double H = Double.parseDouble(st.nextToken()); //6
            double W = Double.parseDouble(st.nextToken()); //12
            double N = Double.parseDouble(st.nextToken()); //72

            double floor = (N % H) * 100;
            if(floor == 0.0) {
                floor = H * 100;
            }
            double room = Math.ceil((N / H));
            int roomNum =(int)(floor + room);

            result.append(roomNum + "\n");
        }
        System.out.println(result);
    }
}