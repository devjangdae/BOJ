import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		while(st.hasMoreTokens()) {
			String temp = st.nextToken();
			
			str = str.replaceAll(temp, temp.toLowerCase());
			
		}
		
		System.out.println(str);

	}

}