package class_demo_1;

public class StudentDemo {
    public static void main(String[] args) {
        Student student1 = new Student();

        /**
         * 外部改非私有成员变量
         */
        System.out.println(student1.name);
        student1.name = "恶意改名";
        System.out.println(student1.name);

        /**
         * 使用Studen类
         */
        student1.show();
        student1.setName("Adrian");
        student1.setAge(10);
        System.out.println(student1.getName() + "," + student1.getAge());
        student1.doHomework();

        Student student2 = new Student("Sun",20);
        student2.show();
    }
}



