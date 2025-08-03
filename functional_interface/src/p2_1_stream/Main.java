package p2_1_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        stream_collect_map();
    }

    public static void stream_overview() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("林青霞"); list.add("张曼玉"); list.add("王祖贤"); list.add("柳岩"); list.add("张敏"); list.add("张无忌");
        list.stream().filter(s -> s.startsWith("张")).filter(s -> s.length() >= 3).forEach(System.out::println);
    }
    public static void stream_2(){
        ArrayList<String> list = new ArrayList<String>();
        list.add("林青霞"); list.add("张曼玉"); list.add("王祖贤");
        list.add("柳岩"); list.add("张敏"); list.add("张无忌");

        Stream<String> s1 = list.stream().limit(4);
        Stream<String> s2 = list.stream().skip(2);

        Stream.concat(s1,s2).distinct().forEach(System.out::println);

    }

    public static void stream_3() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("linqingxia");
        list.add("zhangmanyu");
        list.add("wangzuxian");
        list.add("liuyan");
        list.add("zhangmin");
        list.add("zhangwuji");
        //list.stream().sorted().forEach(System.out::println);
        list.stream().sorted((a,b)-> {
            int num1 = a.length() - b.length();
            int num2 = num1 == 0 ? a.compareTo(b): num1;
            return num2;
        }).forEach(System.out::println);
    }
    public static void stream_4() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("10");
        list.add("20");
        list.add("30");
        list.add("40");
        list.add("50");
        list.stream().map(Integer::parseInt).forEach(System.out::println);
        int sum = list.stream().mapToInt(Integer::parseInt).sum();
        System.out.println(sum);
    }

    public static void stream_5() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("林青霞"); list.add("张曼玉"); list.add("王祖贤"); list.add("柳岩"); list.add("张敏"); list.add("张无忌");
        long count = list.stream().filter(str->str.startsWith("张")).count();
        System.out.println(count);
    }

    public static void stream_collect() {
        List<String> list = new ArrayList<String>();
        list.add("林青霞");
        list.add("张曼玉");
        list.add("王祖贤");
        list.add("柳岩");
        List<String> list2 = list.stream().filter(s -> s.length() == 3).collect(Collectors.toList());
        for(String s : list2) {
            System.out.println(s);
        }
    }

    public static void stream_collect_map() {
        String[] strArray = {"林青霞,30", "张曼玉,35", "王祖贤,33", "柳岩,25"};
        Map<String,Integer> map1 = Stream.of(strArray)
                .filter(s -> Integer.parseInt(s.split(",")[1]) > 28)
                .collect(Collectors.toMap(s->s.split(",")[0],s-> Integer.parseInt(s.split(",")[1])));
        Set<String> keySet = map1.keySet();
        for(String key : keySet) {
            System.out.println(key + ":" + map1.get(key));
        }
    }
}