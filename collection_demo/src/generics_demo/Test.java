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
        genericsInter();

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

        Generics<Integer> t = new Generics<Integer>();
        t.setT(10);
        System.out.println(t.getT());
        Generics<String> s = new Generics<String>();
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

    /**
     * 16. 泛型接口
     */
    public static void genericsInter(){
        GenericsImp<String> g1 = new GenericsImp<String>();
        g1.show("ttt");
        GenericsImp<Integer> g2 = new GenericsImp<Integer>();
        g2.show(20);
    }

    /**
     * 17. 类型通配符
     */
    public static void wildcard(){
        List<?> list1 = new ArrayList<Object>();
        List<?> list2 = new ArrayList<Number>();
        List<?> list3 = new ArrayList<Integer>();

        // List<? extends Number> list4 = new ArrayList<Object>();
        List<? extends Number> list5 = new ArrayList<Number>();
        List<? extends Number> list6 = new ArrayList<Integer>();

        List<? super Number> list7 = new ArrayList<Object>();
        List<? super Number> list8 = new ArrayList<Number>();
        // List<? super Number> list9 = new ArrayList<Integer>();
    }
}
