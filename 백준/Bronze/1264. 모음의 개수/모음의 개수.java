import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        boolean flag = true;

        while(flag){
            String str = br.readLine();
            char[] charArr = str.toCharArray();
            int cnt = 0;

            for(int i = 0 ; i < charArr.length; i++){
                if(charArr[i] == 'a' || charArr[i] == 'A') {
                    cnt++;
                } else if (charArr[i] == 'e' || charArr[i] == 'E') {
                    cnt++;
                } else if (charArr[i] == 'i' || charArr[i] == 'I') {
                    cnt++;
                } else if (charArr[i] == 'o' || charArr[i] == 'O') {
                    cnt++;
                } else if (charArr[i] == 'u' || charArr[i] == 'U') {
                    cnt++;
                }
            }

            if(charArr[0] == '#') {
                flag = false;
            } else {
                System.out.println(cnt);
            }
        }
    }
}

