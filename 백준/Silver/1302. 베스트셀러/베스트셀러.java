import java.util.*;
import java.io.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        // 책의 제목별 팔린 횟수를 기록하기 위한 HashMap
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String book = br.readLine();
            map.put(book, map.getOrDefault(book, 0) + 1);
        }

        // 가장 많이 팔린 책의 판매 횟수 찾기
        int maxCount = 0;
        for (int count : map.values()) {
            if (count > maxCount) {
                maxCount = count;
            }
        }

        // 가장 많이 팔린 책들 중에서 사전 순으로 가장 앞서는 제목 찾기
        ArrayList<String> bestSellers = new ArrayList<>();
        for (String book : map.keySet()) {
            if (map.get(book) == maxCount) {
                bestSellers.add(book);
            }
        }

        Collections.sort(bestSellers);
        System.out.println(bestSellers.get(0));
    }
}