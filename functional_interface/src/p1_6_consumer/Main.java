package p1_6_consumer;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {

//        Consumer consumer = System.out::println;
//        consumer.accept("I love Hong");

       operatingString("I love Hong",System.out::println);
       operatingString("I love Hong",(s) -> System.out.println(new StringBuilder(s).reverse()));

        operatingStringCombine(
                "I love Hong",
                (s) -> System.out.println(new StringBuilder(s).reverse()),
                System.out::println
        );

        String[] strArr = {"yanglinde,17","hongdanping,18","gengxinxin,17"};
        printMembers(strArr,
                (s -> System.out.print("name:" + s.split(",")[0])),
                (s) -> System.out.println(",age:" + s.split(",")[1]));
    }
    public static void operatingString(String str,Consumer<String> consumer) {
         consumer.accept(str);
    }
    public static void operatingStringCombine(String str,Consumer<String> consumer1, Consumer<String> consumer2) {
        consumer1.andThen(consumer2).accept(str);
    }
    public static void printMembers(String[] strArr,Consumer<String> consumer1,Consumer<String> consumer2) {
        for (String str:strArr) {
            consumer1.andThen(consumer2).accept(str);
        }

    }



}