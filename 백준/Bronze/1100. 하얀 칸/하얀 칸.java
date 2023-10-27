import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int count = 0;

        for(int i = 0; i < 8; i++){
            String lineStr = br.readLine();
            if(i % 2 == 0){ // 첫칸 흰색
                String[] words = lineStr.split("");

                for(int j = 0; j < 8; j++){
                    if(j % 2 == 0){
                        if(words[j].equals("F")){
                            count++;
                        }
                    }

                }

            } else { // 첫칸 흑색
                String[] words = lineStr.split("");

                for(int j = 0; j < 8; j++){
                    if(j % 2 != 0){
                        if(words[j].equals("F")){
                            count++;
                        }
                    }
                }
            }
        }
        System.out.println(count);
    }
}