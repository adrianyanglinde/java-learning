package state_modify_demo;


public class Student3 {
    public String name = "耿欣欣";
    public static String university = "4399";

    public void show1(){

    }
    public static void show2(){

    }

    /**
     * 非静态成员方法能访问：
     *   静/非静 态成员变量，静/非静 态成员方法
     */
    public void show3(){
        System.out.println(name);
        System.out.println(university);
        show1();
        show2();
    }

    /**
     * 静态成员方法能访问：
     *   静 态成员变量，静 态成员方法
     */
    public static void show4(){
        //System.out.println(name);
        System.out.println(university);
        //show1();
        show2();
    }
    /**
     * 一句话：静态成员方法只能访问静态成员
     */
}
