import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        char[] charArray = s.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            if(Character.isLowerCase(c)){
                charArray[i] = Character.toUpperCase(c);
            } else if(Character.isUpperCase(c)){
                charArray[i] = Character.toLowerCase(c);
            }
        }

        String result = new String(charArray);
        System.out.println(result);
    }
}