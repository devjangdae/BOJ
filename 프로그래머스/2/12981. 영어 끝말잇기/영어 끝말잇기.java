import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        HashSet<String> usedWords = new HashSet<>();
        int player = 0;
        int turn = 1;

        String prevWord = words[0];
        usedWords.add(prevWord);

        for (int i = 1; i < words.length; i++) {
            player = (player + 1) % n;
            if (i % n == 0) {
                turn++;
            }

            if (usedWords.contains(words[i]) || prevWord.charAt(prevWord.length() - 1) != words[i].charAt(0)) {
                return new int[]{player + 1, turn};
            }

            usedWords.add(words[i]);
            prevWord = words[i];
        }

        return new int[]{0, 0};
    }
}