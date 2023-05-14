import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] submitted = new int[30];

        for (int i = 0; i < 30; i++) {
            submitted[i] = 0;
        }

        for (int i = 0; i < 28; i++) { // 28번
            int num = Integer.parseInt(br.readLine());
            submitted[num-1] = 1;
        }

        for (int i = 0; i < 30; i++) {
            if (submitted[i] != 1) {
                System.out.println(i+1);
            }
        }
    }
}