package lambda_demo3;


public class Main {
    /**
     * 1.5Lambda表达式练习3
     * 有参有返回值抽象方法的练习
     */
    public static void main(String[] args) {
        // 方法一 普通类
        useAddable(new AddableImp());

        // 方法二 匿名内部类
        useAddable(new Addable() {
            @Override
            public int add(int a, int b) {
                System.out.println("implement by anonymous class");
                return a + b;
            }
        });

        // 方法三 lambda表达式
        useAddable((a,b) -> {
            System.out.println("implement by lambda");
            return a+b;
        });

    }

    public static void useAddable(Addable addable) {

        addable.add(3,7);
    }
}
