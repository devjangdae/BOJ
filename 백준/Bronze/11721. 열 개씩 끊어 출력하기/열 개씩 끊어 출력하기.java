import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();
        int num = str.length() / 10;
        for(int i = 0; i < num; i++){
            sb.append(str.substring(0,10)+ "\n");
            str = str.substring(10);
        }
        if(str.length() % 10 != 0){
            sb.append(str);
        }
        System.out.println(sb);
    }
}