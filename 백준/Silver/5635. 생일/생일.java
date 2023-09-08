import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Student {
    String name;
    int day, month, year;

    public Student(String name, int day, int month, int year) {
        this.name = name;
        this.day = day;
        this.month = month;
        this.year = year;
    }
}

class Main {
    static Comparator<Integer> comp = new Comparator<Integer>() {

        @Override
        public int compare(Integer o1, Integer o2) {
            return -(o1 - o2);
        }
    };

    static Comparator<Student> comp2 = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            if (o1.year != o2.year) {
                return -(o1.year - o2.year);
            } else if (o1.month != o2.month) {
                return -(o1.month - o2.month);
            } else {
                return -(o1.day - o2.day);
            }
        }
    };

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        //List<Student> arr = new ArrayList<Student>(); -- 리스트 말고 트리셋 사용
        TreeSet<Student> ts = new TreeSet<>(comp2);

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            String name = st.nextToken();
            int day = Integer.parseInt(st.nextToken());
            int month = Integer.parseInt(st.nextToken());
            int year = Integer.parseInt(st.nextToken());

            Student s = new Student(name, day, month, year);

            //arr.add(s);
            ts.add(s);
        }

        System.out.println(ts.first().name);
        System.out.println(ts.last().name);

    }
}