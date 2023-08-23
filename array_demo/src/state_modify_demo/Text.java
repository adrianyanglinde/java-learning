package state_modify_demo;

/**
 * 016
 * 状态修饰符:
 *  - final(最终态)
 *  - static(静态)
 */


public class Text {
    public static void main(String[] args) {

        /**
         *  final是最终的意思，可修饰成员方法，成员变量和类
         *  - final修饰的方法 表明是最终方法，不可被重写
         *  - final修饰的变量 表明是常量，不可被赋值
         *  - final修饰的类 表明是最终类，不可被继承
         */
        Zi z = new Zi();
        z.method();
        z.show();


        /**
         * 017
         * final 修饰局部变量
         */

       // 修饰基本类型变量，数据值不能变
        final int age = 20;
//        age = 100;
        System.out.println(age);


        // 修饰引用类型变量，地址值不能变，地址里的内容可变
        final Student st = new Student();
        st.age = 100;
        System.out.println(st.age);

        // st = new Student();



        /**
         * 018
         * static是静态的意思，可修饰成员方法，成员变量
         *
         * 1. 被所有对象共享的成员我们用静态修饰
         * 2. 静态修饰的成员可以通过对象访问，也可通过类来访问，建议用类来访问
         */
        Student2.university = "4399";
        Student2 st1 = new Student2();
        st1.name = "耿欣欣";
        st1.age = 30;
        // 每一个成员都是来自4399，每次都要弄？不用，用static修饰
        // 最好不要像下面写在对象上，用（类.静态成员变量）
        // st1.university = "4399";
        st1.show();

        Student2 st2 = new Student2();
        st2.name = "杨林德";
        st2.age = 31;
        // st2.university = "4399";
        st2.show();


        /**
         * 019
         * static访问特点
         *
         * 见Student3
         */
    }
}
