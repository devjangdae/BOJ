import java.io.*;
import java.util.*;

public class Main {
    static class student {
        int age;
        int classNumber;

        student(int age, int classNumber){
            this.age = age;
            this.classNumber = classNumber;
        }

    }

    public static Comparator<student> comp = (o1, o2) -> o1.classNumber - o2.classNumber;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            arr.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(arr, Comparator.naturalOrder());

        for(Integer a : arr){
            System.out.println(a);
        }

    }
}