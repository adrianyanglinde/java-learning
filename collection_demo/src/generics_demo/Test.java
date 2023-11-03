package generics_demo;

/**
 * day6
 */



import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * 13. 泛型
 * 概述：（见图）
 * 好处：
 *  1.把运行期出错提前到编译期
 *  2.避免强制类型转换
 */
public class Test {
    public static void main(String[] args) {
        genericsFn();

    }
    public static void def() {

        Collection<String> co = new ArrayList<String> ();
        co.add("hello");
        co.add("world");
        co.add("java");
        // co.add(100);  // 编译期报错：把运行期出错提前到编译期

        Iterator<String> it = co.iterator();
        while (it.hasNext()){
            // String str = (String) it.next(); // ClassCastException 要强转
            String str = it.next();
            System.out.println(str);
        }

    }

    /**
     * 14. 泛型类
     */
    public static void genericsClass() {
//        Teacher t = new Teacher();
//        t.setAge(10);
//        System.out.println(t.getAge());
//        Student s = new Student();
//        s.setName("ttt");
//        System.out.println(s.getName());

        Generics t = new Generics<Integer>();
        t.setT(10);
        System.out.println(t.getT());
        Generics s = new Generics<String>();
        s.setT("ttt");
        System.out.println(s.getT());
    }

    /**
     * 15. 泛型方法
     */
    public static void genericsFn() {
        GenericsFn gf = new GenericsFn();
        gf.show("ttt");
        gf.show(20);
        gf.show(true);
        gf.show(12.33);
    }
}
