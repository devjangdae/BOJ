import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for(int i = N; N > 0; N-- ){
            for(int j = 0 ; j < N; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}