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
        genericsClass();

    }
    public static void def() {

        Collection<String> co = new ArrayList<String>();
        co.add("hello");
        co.add("world");
        co.add("java");
        //co.add(100);  // 编译期报错：把运行期出错提前到编译期

        Iterator<String> it = co.iterator();
        while (it.hasNext()){
            // String str = (String) it.next(); // ClassCastException 要强转
            String str = it.next();
            System.out.println(str);
        }

//        for(String str:co){
//            System.out.println(str);
//        }
    }

    /**
     * 14. 泛型类
     */
    public static void genericsClass() {

    }
}
