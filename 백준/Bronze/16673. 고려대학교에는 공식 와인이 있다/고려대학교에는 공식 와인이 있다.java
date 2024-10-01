import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();//year
		int k = scan.nextInt();//love
		int p = scan.nextInt();//overdose
		int arr[]=new int[100];
		int sum = 0;
		int count = 0;
		
		for(int i =0; i<=n; i++) {
			sum = k*i+p*i*i;
			count+=sum;
		
	}
			System.out.println(count);
	}
}