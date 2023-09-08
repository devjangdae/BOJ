import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {

    static Comparator<Integer> comp = new Comparator<Integer>() {

        @Override
        public int compare(Integer o1, Integer o2) {
            return o1 - o2;
        }
    };

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        List<Integer> arr = new ArrayList<>();

        while (st.hasMoreTokens()) {
            arr.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(arr, comp);
        System.out.println(arr.get(1));
    }
}