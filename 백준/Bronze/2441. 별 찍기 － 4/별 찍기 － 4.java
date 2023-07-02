import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++){
            for(int j = 0; j < i; j++){
                sb.append(" ");
                //System.out.print("띠기");
            }
            for(int k = N; k - i > 0; k--){
                sb.append("*");
                //System.out.print("별");
            }
            sb.append("\n");
            //System.out.println();
        }
        System.out.println(sb);
    }
}

