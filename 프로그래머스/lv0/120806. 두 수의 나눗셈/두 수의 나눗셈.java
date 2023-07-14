class Solution {
    public double solution(double num1, double num2) {
        double answer = 0;
        answer = num1 / num2 * 1000;
        answer = Math.floor(answer);
        return answer;
    }
}