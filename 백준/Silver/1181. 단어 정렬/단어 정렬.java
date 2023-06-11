import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // HashSet으로 중복된 단어 제거
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            set.add(br.readLine());
        }

        // ArrayList로 변환
        List<String> list = new ArrayList<>(set);

        // Comparator를 사용하여 정렬
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                // 길이가 같다면 사전순으로
                if (s1.length() == s2.length()) {
                    return s1.compareTo(s2);
                } else {
                    // 다르다면 단어 길이가 짧은 것부터
                    return s1.length() - s2.length();
                }
            }
        });

        for (String s : list) {
            System.out.println(s);
        }

    }
}