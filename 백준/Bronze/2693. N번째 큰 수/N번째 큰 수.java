import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {

    static Comparator<Integer> comp = new Comparator<Integer>() {

        @Override
        public int compare(Integer o1, Integer o2) {
            return -(o1 - o2);
        }
    };

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());


        for (int i = 0; i < N; i++) {
            List<Integer> arr = new ArrayList<>();
            st = new StringTokenizer(br.readLine());

            while (st.hasMoreTokens()) {
                arr.add(Integer.parseInt(st.nextToken()));
            }

            Collections.sort(arr, comp);
            System.out.println(arr.get(2));
        }

    }
}