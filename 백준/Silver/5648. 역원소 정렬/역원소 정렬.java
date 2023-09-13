import java.io.*;
import java.util.*;

public class Main {
    private static final int RADIX = 10;
    private static final int MAX_DIGITS = 13;  

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = sc.nextInt();
        long[] arr = new long[n];

        for (int i = 0; i < n; i++) {
            arr[i] = reverseNum(sc.next());
        }

        radixSort(arr);

        for (long x : arr) {
            bw.write(x + "\n");
        }

        bw.close();
        sc.close();
    }

    private static long reverseNum(String str) {
        return Long.parseLong(new StringBuilder(str).reverse().toString());
    }

    private static void radixSort(long[] arr) {
        List<Long>[] buckets = new ArrayList[RADIX];
        for (int i = 0; i < RADIX; i++) {
            buckets[i] = new ArrayList<>();
        }

        long divisor = 1;

        for (int i = 0; i < MAX_DIGITS; i++) {
            for (long number : arr) {
                int bucketIndex = (int) ((number / divisor) % RADIX);
                buckets[bucketIndex].add(number);
            }

            int index = 0;
            for (List<Long> bucket : buckets) {
                for (long number : bucket) {
                    arr[index++] = number;
                }
                bucket.clear();
            }

            divisor *= RADIX;
        }
    }
}
