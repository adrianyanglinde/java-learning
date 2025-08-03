package p2_1_stream;

import java.util.ArrayList;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("林青霞"); list.add("张曼玉"); list.add("王祖贤"); list.add("柳岩"); list.add("张敏"); list.add("张无忌");
        list.stream().filter(s -> s.startsWith("张")).filter(s -> s.length() >= 3).forEach(System.out::println);
    }

}