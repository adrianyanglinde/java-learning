package p1_1_functional_interface_overview;

public class Main {
    public static void main(String[] args) {
        // 可以用做局部变量
        Inter inter = () -> System.out.println("used as variable");
        inter.show();
        // 可以用做方法参数传递
        useInter(() -> System.out.println("used as params of method"));
    }
    public static void useInter(Inter inter) {
        inter.show();
    }
}