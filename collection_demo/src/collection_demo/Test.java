package collection_demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import student.Student;

/**
 * 02. Collection
 * - 顶层接口，表示一组对象，这些对象也称为Collection的元素
 * - JDK 不提供此接口的任何直接实现，它提供更具体的子接口（如Set List）实现
 * 元素只能是引用类型?
 */
public class Test {

    public static void main(String[] args) {

//        common();

    }
    /**
     * 03. Collection常用方法
     */
    public static void common() {
        Collection<String> co = new ArrayList<String>();
        co.add("hello");
        co.add("world");
        co.add("java");
        System.out.println(co.size());
        co.remove("world");
        System.out.println(co.contains("world"));
        co.clear();
        System.out.println(co.isEmpty());
        System.out.println(co);  // 输出字符串：println调用了对象的toString, ArrayList改写了toString
    }
    /**
     * 04. Collection集合的遍历
     * Iterator: 迭代器，集合的专用遍历方式
     * - Iterator<E>   iterator(): 返回此集合中的迭代器 ，依赖集合存在
     */
    public static void iterator() {
        Collection<String> arr = new ArrayList<String>();
        arr.add("hello");
        arr.add("world");
        arr.add("java");

        Iterator<String> it = arr.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }

    /**
     * 06. 案例：遍历学生集合
     */
    private static void iteratorStudent() {
        Collection<Student> arr = new ArrayList<Student>();
        Student st1 = new Student("1","yanlinde","31","ddd");
        Student st2 = new Student("2","hongdanping","32","hhh");
        Student st3 = new Student("3","gengxinxin","30","hhho");
        arr.add(st1);
        arr.add(st2);
        arr.add(st3);

        Iterator<Student> it = arr.iterator();
        while (it.hasNext()){
            System.out.println(it.next().getName());
        }

    }



}
