import java.io.BufferedReader;
import java.io.InputStreamReader;

class Solution {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder result = new StringBuilder();	
		
		int num = Integer.parseInt(br.readLine());

		for (int i = 0; i < num; i++) {
			result.append("#");
		}
		
		System.out.println(result);
	}
}