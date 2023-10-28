import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();
        HashMap<String, Integer> mapComplete = new HashMap<>();
        
        for(String str : participant){
            map.put(str, map.getOrDefault(str, 0) + 1);
        }
        
        for(String str : completion){
            mapComplete.put(str, mapComplete.getOrDefault(str, 0) + 1);
        }
        
        //for(Map.Entry<String, Integer> entry : map.entrySet()) {
        //    String key = entry.getKey();
        //    int value = entry.getValue();
        //    System.out.println("key :" + key + " value: " + value);
        //}
        
        
        for(String str : map.keySet()){
            if(mapComplete.containsKey(str)){
                //System.out.println("키있음");
                if(!map.get(str).equals(mapComplete.get(str))){
                    //System.out.println("틀린놈발견" + str);
                    answer = str;
                }
            } else {
                //System.out.println("키없음");
                answer = str;
            }
        }
        
        
        
        
        return answer;
    }
}