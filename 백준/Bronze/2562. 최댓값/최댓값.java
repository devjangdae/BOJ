import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        int[] arr = new int[9];
        int[] sortArr = new int[9];

        for (int i = 0; i < arr.length; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken());
            sortArr[i] = arr[i];
        }

        Arrays.sort(sortArr);

        int maxNum = sortArr[sortArr.length - 1];
        int maxNumIndex = 0;

        for (int i = 0; i < sortArr.length; i++) {
            if (arr[i] == maxNum) {
                maxNumIndex = i + 1;
            }
        }

        System.out.println(maxNum);
        System.out.println(maxNumIndex);
    }
}