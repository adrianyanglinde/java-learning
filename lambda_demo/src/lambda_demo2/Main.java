package lambda_demo2;



public class Main {
    /**
     * 1.4Lambda表达式练习2
     * 有参无返回值抽象方法的练习
     */
    public static void main(String[] args) {
        // 方法一 普通类
        useFlyable(new FlyableImp());

        // 方法二 匿名内部类
        useFlyable(new Flyable() {
            @Override
            public void fly(String s) {
                System.out.println(s + "implement fly by anonymous inner class");
            }
        });

        // 方法三 lambda表达式
        useFlyable(s -> System.out.println(s + "implement fly by lambda"));

    }

    public static void useFlyable(Flyable flyable) {

        flyable.fly("adrian");
    }
}
