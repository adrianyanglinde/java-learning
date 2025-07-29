package p3_4_reference_to_object_method;

public class Main {
    public static void main(String[] args) {

       usePrint(s-> System.out.println(s.toUpperCase()));

        PrintString ps = new PrintString();
        usePrint(ps::printUpperCaseString);

        // Print 接口的方法：void printUpperCase(String s)
        // PrintString 的方法：void printUpperCaseString(String string)
        // 为什么能匹配成功？
//        因为它们的：
//        1.参数类型相同（都是 String）
//        2.返回类型相同（都是 void）
//        3.方法名虽然不同但不影响（方法引用只看签名）


        // 底层实现
        // 1. Java 会自动生成一个 Print 接口的匿名实现
        // 2. 这个实现的 printUpperCase() 方法会委托调用 ps.printUpperCaseString()
        // 相当于编译器帮你写了：
        usePrint(new Print() {
            @Override
            public void printUpperCase(String s) {
                ps.printUpperCaseString(s);  // 委托调用
            }
        });
    }

    public static void usePrint(Print print) {
        print.printUpperCase("abc");
    }
}
