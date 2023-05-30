import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        StringBuilder result = new StringBuilder();
        
        int loop = Integer.parseInt(br.readLine());

        for (int i = 0; i < loop; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int refeatNum = Integer.parseInt(st.nextToken());
            String str = st.nextToken();

            for(int j = 0; j < str.length(); j++) {
                for(int k = 0; k < refeatNum; k++){
                    result.append(str.charAt(j));
                }
            }
            result.append("\n");
        }

        System.out.println(result);
    }
}
/*
2
3 ABC
5 /HTP

AAABBBCCC
/////HHHHHTTTTTPPPPP
 */