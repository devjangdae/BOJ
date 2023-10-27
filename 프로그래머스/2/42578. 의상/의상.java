import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        // 1. 옷을 종류별로 구분한다.
        HashMap<String, Integer> map = new HashMap<>();
        for(String[] clothe : clothes){
            String type = clothe[1];
            System.out.println(clothe[1]);
            map.put(type, map.getOrDefault(type, 0) + 1);
        }
        
        // 2. 입지 않는 경우를 추가해서 모든 조합을 계산한다.
        Iterator<Integer> it = map.values().iterator();
        int answer = 1;
        
        while(it.hasNext()){
            answer *= it.next().intValue() + 1;
        }
        
        // 3. 아무 옷도 입지 않은 경우는 제외한다.
        return answer - 1;
    }
}