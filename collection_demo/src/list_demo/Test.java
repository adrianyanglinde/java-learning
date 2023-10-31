package list_demo;

import student.Student;

import java.util.*;

/**
 * 07. List集合
 * 概述：
 *  - 有序集合（也称为序列），可以精确控制列表中每个元素插入位置，可通过索引访问元素
 *  - 与Set集合不同，通常允许重复的元素
 * 特点：
 *  - 有序：存储和取出的顺序一致
 *  - 可重复：存储的元素可以重复
 */
public class Test {
    public static void main(String[] args) {
        linkedList();
    }
    public static void common() {
        List<String> co = new ArrayList<String>();
        co.add("hello");
        co.add("world");
        co.add("java");
        co.add("world");

        /**
         * 08. List集合常用方法
         */
        co.add(1,"javaEE");
        co.remove(1);
        co.set(2,"javaEE");
        System.out.println(co.get(2));
        System.out.println(co);
        // list 带索引的 可用for遍历
        for (int i = 0; i < co.size(); i++) {
            System.out.println(co.get(i));
        }

    }
    /**
     * 09. 案例：遍历学生集合
     */
    private static void iteratorStudent() {
        List<Student> arr = new ArrayList<Student>();
        Student st1 = new Student("1","yanlinde","31","ddd");
        Student st2 = new Student("2","hongdanping","32","hhh");
        Student st3 = new Student("3","gengxinxin","30","hhho");
        arr.add(st1);
        arr.add(st2);
        arr.add(st3);

        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i).getName());
        }


    }
    /**
     * 10. 并发修改异常
     * ConcurrentModificationException: 并发修改异常
     * 翻源码*
     * 迭代器获取元素判断实际修改次数和预期修改次数不一致
     */
    private static void bingfa() {
        List<String> arr = new ArrayList<String>();
        arr.add("hello");
        arr.add("world");
        arr.add("java");

//        Iterator<String> it = arr.iterator();
//        while (it.hasNext()){
//            String str = it.next();
//            if(str.equals("world")){
//                arr.add("javaEE");
//            }
//        }
        for (int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == "world"){
                arr.add("javaEE");
            }
        }
        System.out.println(arr);
    }

    /**
     * 11. ListIterator 列表迭代器
     * List特有迭代器
     * 允许从任意方向遍历列表的迭代器，在迭代期间修改列表，并在列表中获取迭代器当前位置
     */
    private static void listIterator() {
        List<String> arr = new ArrayList<String>();
        arr.add("hello");
        arr.add("world");
        arr.add("java");

        ListIterator<String> lit = arr.listIterator();
//        while (lit.hasNext()){
//            String str = lit.next();
//            System.out.println(str);
//        }
//        while (lit.hasPrevious()){
//            String str = lit.previous();
//            System.out.println(str);
//        }
        while (lit.hasNext()){
            String str = lit.next();
            if(str.equals("world")){
                // 通过ListIterator来添加
                lit.add("javaEE");
            }
        }
        System.out.println(arr);
        /**
         * 源码分析
         *
         */
    }

    /**
     * 12. 增强for
     * 简化数组和Collection集合的遍历
     * - 实现Iterable接口的类允许其对象成为增强型for语句的目标
     * - 其内部原理是一个Iterator迭代器
     */
    private static void enhanceFor() {
        int[] arr = {1,2,3,4,5};
        for(int i: arr){
            System.out.println(i);
        }

        List<String> li = new ArrayList<String>();
        li.add("hello");
        li.add("world");
        li.add("java");
        for(String i: li){
            // 验证其内部原理是一个Iterator迭代器
            if(i.equals("world")){
                li.add("javaEE");
            }
            System.out.println(i);
        }
    }

    /**
     * 13 17. 案例：List集合存储学生对象三种方式遍历
     * 只是遍历：增强for
     * 使用索引：for
     */
    private static void traverseStudent() {
        List<Student> arr = new ArrayList<Student>();
        Student st1 = new Student("1","yanlinde","31","ddd");
        Student st2 = new Student("2","hongdanping","32","hhh");
        Student st3 = new Student("3","gengxinxin","30","hhho");
        arr.add(st1);
        arr.add(st2);
        arr.add(st3);


        for(Student st: arr){
            System.out.println(st.getName());
        }

        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i).getName());
        }

        Iterator<Student> it = arr.iterator();
        while (it.hasNext()){
            System.out.println(it.next().getName());
        }
    }

    /**
     * 16. List集合特点
     * ArrayList: List接口的数组实现，底层数据结构是数组
     * LinkedList: List接口的链表实现，底层数据结构是链表
     */
    private static void listArrayLink() {

    }


    /**
     * 18. LinkedList特有功能
     */
    private static void linkedList() {
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("hello");
        ll.add("world");
        ll.add("java");
        ll.addFirst("javaFirst");
        ll.addLast("javaLast");
        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);
    }
}
