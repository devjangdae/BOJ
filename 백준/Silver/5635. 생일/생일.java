import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.StringTokenizer;
import java.util.TreeSet;

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

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // 나이를 비교하는 Comparator 정의
        Comparator<Student> ageComparator = new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                if(s1.year != s2.year){
                    return -Integer.compare(s1.year, s2.year);
                }
                if(s1.month != s2.month){
                    return -Integer.compare(s1.month, s2.month);
                }
                return -Integer.compare(s1.day, s2.day);
            }
        };

        TreeSet<Student> students = new TreeSet<>(ageComparator);

        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int day = Integer.parseInt(st.nextToken());
            int month = Integer.parseInt(st.nextToken());
            int year = Integer.parseInt(st.nextToken());
            students.add(new Student(name, day, month, year));
        }

        Student youngestPerson = students.first();
        Student oldestPerson = students.last();

        System.out.println(youngestPerson.name);  // 가장 나이가 적은 사람의 이름 출력
        System.out.println(oldestPerson.name);     // 가장 나이가 많은 사람의 이름 출력

    }
}