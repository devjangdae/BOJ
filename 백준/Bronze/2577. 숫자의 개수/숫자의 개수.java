import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        String strSum = String.valueOf(a * b * c);

        char[] chrArr = strSum.toCharArray();
        
        for (int i = 0; i < 10; i++) {
            int cnt = 0;
            for (int j = 0; j < chrArr.length; j++) {
                if(Integer.parseInt(String.valueOf(chrArr[j])) == i){
                    cnt += 1;
                }
            }
            System.out.println(cnt);
        }
    }
}