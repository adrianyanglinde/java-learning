package cn.itcast;

import com.itheima_01.Student;

public class Test01 {
    public static void main(String[] args) {
        Student student = new Student();
        student.study();

        System.out.println("当前Java版本: " + System.getProperty("java.version"));
        System.out.println("Java规范版本: " + System.getProperty("java.specification.version"));
    }
}
