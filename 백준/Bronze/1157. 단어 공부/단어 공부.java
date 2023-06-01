import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        HashMap<Character, Integer> map = new HashMap<>();
        String str = br.readLine().toUpperCase();

        for (int i = 0; i < str.length(); i++) {
            if (!map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), 1);
            } else {
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
            }
        }

        int max = 0;
        boolean isDuplicate = false;
        char ch = ' ';

        for (char c : map.keySet()) {
            if (map.get(c) < max) {
                continue;
            } else if (map.get(c) > max) {
                ch = c;
                max = map.get(c);
                isDuplicate = false;
            } else if (map.get(c) == max) {
                isDuplicate = true;
            }
        }
        if (isDuplicate) {
            System.out.println("?");
        } else {
            System.out.println(ch);
        }
    }
}