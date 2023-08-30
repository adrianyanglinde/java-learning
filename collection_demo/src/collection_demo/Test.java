package collection_demo;

import java.util.ArrayList;
import java.util.Collection;
/**
 * 02. Collection
 * - 顶层接口，表示一组对象，这些对象也称为Collection的元素
 * - JDK 不提供此接口的任何直接实现，它提供更具体的子接口（如Set List）实现
 */
public class Test {

    public static void main(String[] args) {

        Collection<String> co = new ArrayList<String>();
        co.add("hello");
        co.add("world");
        co.add("java");
        System.out.println(co);  // 输出字符串：println调用了对象的toString, ArrayList改写了toString
    }
}
