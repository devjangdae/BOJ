import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
3
        40 80 60 75.0        75
        5
        1 2 4 8 16     38.75

 */
class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int loop = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        double[] arr = new double[loop];
        double max = -1;
        double sum = 0;

        for(int i = 0; i < loop; i++){
            arr[i] = Double.parseDouble(st.nextToken());
            if(max < arr[i]){
                max = arr[i];
            }
        }

        for(int i = 0; i < loop; i++){
            // 점수/M*100
            arr[i] = arr[i] / max * 100;
            sum += arr[i];
        }
        sum = sum / loop;
        
        System.out.println(sum);
    }
}
