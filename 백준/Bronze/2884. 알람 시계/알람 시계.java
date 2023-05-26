import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken()); //a  b   a b     a  b   a b
        int b = Integer.parseInt(st.nextToken()); //10 10  9 25    0  30   23 45

        if (b < 45) {
            b = 60 - (45 - b);
            if (a == 0) {
                a = 23;
            } else {
                a = a - 1;
            }
        } else {
            b = b - 45;
        }
        System.out.println(a + " " + b);
    }
}