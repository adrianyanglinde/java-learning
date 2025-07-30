package p3_6_reference_to_constructor;

public class Main {
    public static void main(String[] args) {
        useStudentBuilder(new StudentBuilder() {
            @Override
            public Student buildStudent(String name, int age) {
                // lambda 表达式被构造器代替时，形参全部传递给构造器作为参数
                return new Student(name, age);
            }
        });
        useStudentBuilder((name, age) -> new Student(name, age));
        useStudentBuilder(Student::new);

    }

    public static void useStudentBuilder(StudentBuilder sb) {
        Student student = sb.buildStudent("hongdanping",18);
        System.out.println(student.getName() + student.getAge());
    }
}
