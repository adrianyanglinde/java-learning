package p1_4_supplier;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
//        Supplier<String> supplier = () -> "Hello World";
//        System.out.println(supplier.get());
//
//        Supplier<Integer> supplier2 = () -> 2;
//        System.out.println(supplier2.get());
        System.out.println(getString(()->"Hello World"));
        System.out.println(getInt(()->1));



    }
    public static String getString(Supplier<String> supplier) {
        return supplier.get();
    }
    public static int getInt(Supplier<Integer> supplier) {
        return supplier.get();
    }

}