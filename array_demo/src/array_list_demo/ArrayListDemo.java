package array_list_demo;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Day9
 * 集合
 * 提供一种存储空间可变的存储模型，存储的数据量可以发送改变
 * 集合类有很多
 */

/**
 * 134. ArrayList<E>
 * 可调整的数组实现，底层是数组
 * E 泛型，可使用引用数据类型替换
 */

public class ArrayListDemo {
    public static void main(String[] args) {
        loopStudentByInput();
    }

    /**
     * 135. 构造和添加
     */
    private static void def() {
        ArrayList<String> array = new ArrayList<>();
        array.add("hello");
        array.add("world");
        array.add("java");

        // array.add(1,"javassssseee");
        // array.add(4,"javaee");
        System.out.println("array" + array);

        /**
         * 136. 常用方法
         */
        // System.out.println("re:" + array.remove("world"));
//        System.out.println(array.remove(1));
//        System.out.println(array.set(1,"javaee"));
//        System.out.println(array.get(3));
//        System.out.println(array.size());
        System.out.println("array" + array);
    }

    /**
     * 136. 遍历集合
     */
    static void loop(){
        ArrayList<String> array = new ArrayList<>();
        array.add("mufc");
        array.add("adrian");
        array.add("hdp");
        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }
    }

    /**
     * 137. 存储学生对象并遍历
     */
    static void loopStudent(){
        ArrayList<Student> array = new ArrayList<>();
        array.add(new Student("adrian",31));
        array.add(new Student("hongdanping",32));
        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i).getName());
        }
    }

    /**
     * * 138. 存储学生对象并遍历升级版
     */
    static void addStudent(ArrayList<Student> array){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生姓名");
        String name = sc.next();
        System.out.println("请输入学生年龄");
        int age = sc.nextInt();
        array.add(new Student(name,age));
    }
    static void loopStudentByInput(){
        ArrayList<Student> array = new ArrayList<>();

        addStudent(array);
        addStudent(array);
        addStudent(array);


        for (int i = 0; i < array.size(); i++) {
            System.out.println("学生：" + array.get(i).getName() + array.get(i).getAge());
        }
    }


}
