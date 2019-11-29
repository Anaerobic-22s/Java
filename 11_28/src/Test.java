import java.util.Arrays;

class Student implements Comparable<Student>{
    public String name;
    public int age;
    public int grade;
    public Student(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    @Override
    public int compareTo(Student o) {
        return this.age - o.age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                '}';
    }
}


public class Test {

    public static void main(String[] args) {
        Student[] students = new Student[]{
                new Student("WANG",23,46),
                new Student("ZHANG",16,72),
                new Student("YANG",20,66),
        };
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));
    }

}
