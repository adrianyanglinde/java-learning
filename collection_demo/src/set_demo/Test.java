package set_demo;

/**
 * day6
 */

import student.Student;
import student.Student2;
import student.Student3;
import student.Student4;

import java.util.*;


/**
 * 01. Set
 *
 * Set集合：
 *  - 不包含重复元素
 *  - 没有带索引，不能使用普通for
 *
 */
public class Test {
    public static void main(String[] args) {
        treeSet();

    }
    public static void def() {
        HashSet<String> hs = new HashSet<String>();
        hs.add("hello");
        hs.add("world");
        hs.add("world");
        hs.add("java");
        for (String str: hs){
            System.out.println(str);
        }
    }

    /**
     * 02. 哈希值
     * 概述：哈希值是JDK根据对象的 地址 或者字符串 或者数字 算出来的int类型的数值
     */
    public static void hash() {

        // 同一个对象哈希值相同
        Student st1 = new Student("1","yanlinde","31","ddd");
        System.out.println(st1.hashCode());
        System.out.println(st1.hashCode());

        // 不同对象哈希值不同
        Student st2 = new Student("1","yanlinde","31","ddd");
        System.out.println(st2.hashCode());

        System.out.println("hello".hashCode());
        System.out.println("world".hashCode());
        System.out.println("java".hashCode());
        System.out.println("world".hashCode());  // "world"是同一个对象

        System.out.println("重地".hashCode());
        System.out.println("通话".hashCode());  // 两个不同字符串 hashCode居然一样，因为字符串有重写hashCode方法
    }

    /**
     * 03. HashSet
     * - 该类通过哈希表实现了Set接口（底层数据结构是哈希表）
     * - 对集合迭代顺序不做保证
     */
    private static void hashSet(){
        HashSet<String> hs = new HashSet<String>();
        hs.add("hello");
        hs.add("world");
        hs.add("java");
        for(String str: hs){
            System.out.println(str);
        }
        System.out.println(hs);
    }

    /**
     * 05. 数据结构之哈希表
     * JDK8 前：底层采用数组+链表实现，可以说是一个元素为链表的数组
     * （视频演示）（图）
     */

    /**
     * 04. HashSet集合保证元素唯一性源码分析
     * （看视频源码分析）
     *  hashCode & equal
     */



    /**
     * 06. HashSet集合存储学生对象并遍历
     * 重写Student 的hashSet&equal,
     */
    private static void hashSetStudent(){
        HashSet<Student> hs = new HashSet<Student>();
        Student st1 = new Student("1","yanlinde","31","ddd");
        Student st2 = new Student("2","hongdanping","32","hhh");
        Student st3 = new Student("3","gengxinxin","30","hhho");
        Student st4 = new Student("2","hongdanping","32","hhh");
        hs.add(st1);
        hs.add(st2);
        hs.add(st3);
        hs.add(st4);
        for(Student st: hs){
            System.out.println(st.getName());
        }

    }

    /**
     * 07. LinkedHashSet  extends HashSet
     * - 哈希表和链表实现了Set接口（底层数据结构是哈希表+链表）
     * - 具有可预测迭代次序
     *      - 由链表保证有序，也就是说元素的存入和取出顺序一致
     *      - 由哈希表保证元素唯一，也就是说没有重复元素
     */
    private static void linkedHashSet(){
        LinkedHashSet<String> lhs = new LinkedHashSet<String>();
        lhs.add("hello");
        lhs.add("world");
        lhs.add("java");
        lhs.add("world");
        for(String str: lhs){
            System.out.println(str);
        }
        System.out.println(lhs);
    }

    /**
     * 08. TreeSet
     * - 元素有序，不是按照存储，而是按照一定规则排序
     *      - TreeSet() 根据元素自然排序 让元素所属的类实现Comparable接口
     *      - TreeSet(Comparator) 根据比较器排序
     */
    private static void treeSet(){
        // 集合存储基本类型要转包装类
        TreeSet<Integer> ts = new TreeSet();
        ts.add(20);
        ts.add(10);
        ts.add(30);
        ts.add(30);
        for (Integer i:ts){
            System.out.println(i);
        }
    }

    /**
     * 09. Comparable 接口
     */
    private static void treeSetComparable(){
        TreeSet<Student2> ts = new TreeSet();
        Student2 st1 = new Student2("yanlinde",31);
        Student2 st2 = new Student2("hongdanping",32);
        Student2 st3 = new Student2("gengxinxin",30);
        Student2 st4 = new Student2("panyiran",32);
        Student2 st5 = new Student2("panyiran",32);

        ts.add(st1);
        ts.add(st2);
        ts.add(st3);
        ts.add(st4);
        ts.add(st5);

        for (Student2 i:ts){
            System.out.println(i.getName() + i.getAge());
        }
    }

    /**
     * 10. 比较器排序Comparator
     */
    private static void treeSetComparator(){
        TreeSet<Student3> ts = new TreeSet(new Comparator<Student3>() {
            @Override
            public int compare(Student3 o1, Student3 o2) {
                int num = o2.getAge() - o1.getAge();
                int num2 = num == 0 ? o1.getName().compareTo(o2.getName()) : num;
                return num2;
            }
        });
        Student3 st1 = new Student3("yanlinde",31);
        Student3 st2 = new Student3("hongdanping",32);
        Student3 st3 = new Student3("gengxinxin",30);
        Student3 st4 = new Student3("panyiran",32);
        Student3 st5 = new Student3("panyiran",32);

        ts.add(st1);
        ts.add(st2);
        ts.add(st3);
        ts.add(st4);
        ts.add(st5);

        for (Student3 i:ts){
            System.out.println(i.getName() + i.getAge());
        }
    }

    /**
     * 11. 案例：成绩排序
     */
    private static void treeSetScore(){
        TreeSet<Student4> ts = new TreeSet(new Comparator<Student4>() {
            @Override
            public int compare(Student4 o1, Student4 o2) {
                int num1 = o2.getSum() - o1.getSum();
                int num2 = num1 == 0 ? o2.getYuwen() - o1.getYuwen() : num1;
                int num3 = num2 == 0 ? o2.getName().compareTo(o1.getName()): num2;
                return num3;
            }
        });
        Student4 st1 = new Student4("yanlinde",80,100);
        Student4 st2 = new Student4("hongdanping",100,80);
        Student4 st3 = new Student4("gengxinxin",80,60);
        Student4 st4 = new Student4("panyiran",80,60);
        ts.add(st1);
        ts.add(st2);
        ts.add(st3);
        ts.add(st3);
        ts.add(st4);
        for (Student4 i:ts){
            System.out.println(i.getName() + "yuwen" + i.getYuwen() + "math" + i.getMath());
        }
    }

    /**
     * 12. 案例：不重复随机数
     */
    private static void treeSetRandom(){
        // Set<Integer> set = new HashSet<>();
        Set<Integer> set = new TreeSet();
        Random r = new Random();
        while (set.size() < 10){
            int aa = r.nextInt(20) + 1;
            set.add(aa);
        }
        for(Integer i:set){
            System.out.println(i);
        }
    }
}
