import p2_2_get_class_obj.Student;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {


        Class<Student> studentClass1 = Student.class;
        Class<Student> studentClass2 = Student.class;
        System.out.println(studentClass1);
        System.out.println(studentClass1 == studentClass2);

        Student st = new Student();
        Class<?> studentClass3 = st.getClass();
        System.out.println(studentClass1 == studentClass3);

        Class<?> studendClass4 = Class.forName("p2_2_get_class_obj.Student");
        System.out.println(studentClass1 == studendClass4);
    }
}