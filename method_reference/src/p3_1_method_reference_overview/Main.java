package p3_1_method_reference_overview;

public class Main {
    public static void main(String[] args) {
       //  usePrintable(s -> System.out.println(s));

        usePrintable(System.out::println);
    }
    public static void usePrintable(Printable printable) {
        printable.printString("love java");
    }
}