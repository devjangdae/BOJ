import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();

        String str = br.readLine();

        while (!str.equals("0")) {
            StringBuilder reverseStr = new StringBuilder(str).reverse();
            if(str.equals(reverseStr.toString())){
                result.append("yes"+"\n");
            } else {
                result.append("no"+"\n");
            }
            str = br.readLine();
        }
        System.out.println(result);
    }
}