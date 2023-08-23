package student_teacher_demo;

/**
 * day1
 */
public class Test {
    /**
     * 011 老师和学生
     */
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.setName("杨林德");
        t1.setAge(31);
        t1.tech();

        Teacher t2 = new Teacher("洪丹萍",32);
        t2.tech();
    }
}
