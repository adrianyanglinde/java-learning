package variable_param_structure;


import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
//        System.out.println(sum('a',1,2,3));
//        System.out.println(sum('a',1,2,3,4));
//        System.out.println(sum('a',1,2,3,4,5));
        exp();
    }

    /**
     * 4.1 可变参数
     */
    public static String sum(char name,int...age){
        int sum = 0;
        for (int a: age){
            sum+=a;
        }
        return String.valueOf(name + sum);
    }

    /**
     * 4.2 可变参数应用
     */
    public static void exp(){
        List<String> list = Arrays.asList("hello", "world", "java");  // 返回固定大小列表

//        list.add("test");
//        list.remove("world");
        list.set(1,"javaee");
        System.out.println(list);

        List<String> list2 = List.of("hello", "world", "java","world");// 返回不可变列表
//        list2.add("test");
//        list2.remove("world");
        // list2.set(1,"javaee");
        System.out.println(list2);

        Set<String> set = Set.of("hello", "world", "java");
//                set.add("test");
//       set.remove("world");
        System.out.println(set);
    }

}
