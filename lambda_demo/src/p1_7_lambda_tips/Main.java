package p1_7_lambda_tips;

public class Main {
    /**
     * 1.7Lambda表达式的注意事项
     */
    public static void main(String[] args) {
        useInter(()-> System.out.println("show implement by lambda"));

        //根据局部变量的赋值得知Lambda对应的接口
        Runnable r = ()-> System.out.println("run implement by lambda");
        new Thread(r).start();

        //根据调用方法的参数得知Lambda对应的接口
        new Thread(() -> System.out.println("run implement by lambda")).start();
    }

    public static void useInter(Inter i) {
        i.show();
    }
}
