import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = 5;

        List<Integer> arr = new ArrayList<Integer>();

        for(int i = 0 ; i < N; i++){
            arr.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(arr, comp);

        int sum = 0;
        for(int i = 0 ; i < N; i++){
            sum += arr.get(i);
        }

        System.out.println(sum/5);
        System.out.println(arr.get(2));
    }

    static Comparator<Integer> comp = new Comparator<Integer>() {

        @Override
        public int compare(Integer o1, Integer o2) {
            return o1-o2;
        }
    };
}