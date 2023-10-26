import java.util.*;
    
class Solution {
    public String solution(String my_string) {
        //소문자 바꾸기
        my_string = my_string.toLowerCase();
        
        //정렬하기
        char[] charArr = my_string.toCharArray();
        Arrays.sort(charArr);
        
        //캐릭터배열을 문자열로 변경
        String str = new String(charArr);
            
        return str;
    }
}