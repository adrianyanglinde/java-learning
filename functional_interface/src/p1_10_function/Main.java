package p1_10_function;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        conver("10", Integer::parseInt);
        convertCombine("10",Integer::parseInt,str -> String.valueOf(str + 60));

        convertCompose("Hong,17",
                str->str.split(",")[1],
                Integer::parseInt,
                age->age+60);
    }
    public static void conver(String str, Function<String,Integer> func) {
        System.out.println(func.apply(str));
    }
    public static void convertCombine(String str, Function<String,Integer> func1, Function<Integer,String> func2) {
        System.out.println(func1.andThen(func2).apply(str));
    }

    public static void convertCompose(String str, Function<String,String> func1, Function<String,Integer> func2, Function<Integer,Integer> func3) {
        System.out.println(func1.andThen(func2).andThen(func3).apply(str));
    }
}