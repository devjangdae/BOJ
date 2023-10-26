import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        int numLength = str.length();

        for (int i = 0; i < numLength; i++) {
            sb1.append(str.charAt(i));
        }

        for (int i = numLength - 1; i >= 0; i--) {
            sb2.append(str.charAt(i));
        }

        if (sb1.toString().equals(sb2.toString())) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }

    }
}