package state_modify_demo;

public class Student2 {
    public String name;
    public int age;
    // static修饰 这个成员变量被所有对象共享
    public static String university;

    public void show(){
        System.out.println(name + age + university);
    }
}
