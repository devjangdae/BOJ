import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int k = sc.nextInt();
		
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		int m = sc.nextInt();
		int[] b = new int[m];
		for(int i = 0; i < m; i++) {
			b[i] = sc.nextInt();
		}
		
		int count = 0;
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				if(a[j] + k == b[i]) {
					count++;
				}
			}
		}
		System.out.println(count);
		sc.close();
	}
}