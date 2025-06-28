import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] a = new int[n];
		double total = 0;
		int count5 = 0;
		int count3 = 0;
		
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			total += a[i];
			if(a[i] == 5) {
				count5++;
			}
			if(a[i] == 3) {
				count3++;
			}
				
		}
		double average = total / n;
		if(count5 == n && count3 == 0) {
			System.out.println("Named");
		}else if(average >= 4.5 && count3 == 0) {
			System.out.println("High");
		}else if(count3 != 0) {
			System.out.println("None");
		}else {
			System.out.println("Common");
		}

		sc.close();
	}
}