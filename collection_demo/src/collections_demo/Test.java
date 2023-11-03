package collections_demo;

import student.Student;
import student.Student3;

import java.util.*;

/**
 * Day7
 */
public class Test {

    public static void main(String[] args) {
        exp();
    }
    /**
     * 11.Collections概述和使用
     */
    public static void def() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(50);
        list.add(30);
        list.add(40);
        Collections.sort(list);
        Collections.reverse(list);
        Collections.shuffle(list);
        System.out.println(list);
    }


    /**
     * 12.Collections对学生排序
     */
    public static void exp() {
        ArrayList<Student3> list = new ArrayList<>();
        list.add(new Student3("hongdanping",32));
        list.add(new Student3("yanglinde",31));
        list.add(new Student3("zhoutian",31));
        list.add(new Student3("panyiran",31));
        list.add(new Student3("gengxinxin",30));
        Collections.sort(list, new Comparator<Student3>() {
            @Override
            public int compare(Student3 s1, Student3 s2) {
                int c1 = s1.getAge() - s2.getAge();
                int c2 = c1 == 0 ? s1.getName().charAt(0) - s2.getName().charAt(0) : c1;
                return c2;
            }
        });
        for(Student3 st:list){
            System.out.println(st.getName());
        }

    }

    /**
     * 13.Collections 斗地主例子
     */
    public static void exp2() {


    }

}
