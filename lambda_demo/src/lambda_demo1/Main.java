package lambda_demo1;

public class Main {
    /**
     * 1.3Lambda表达式练习1
     * 无参无返回值抽象方法的练习
     */
    public static void main(String[] args) {
        // 方法一 普通类
        useEtable(new lambda_demo1.EatableImp());

        // 方法二 匿名内部类
        useEtable(new lambda_demo1.Eatable() {
            @Override
            public void eat() {
                System.out.println("匿名内部类实现eat");
            }
        });

        // 方法三 lambda表达式
        useEtable(()-> System.out.println("lambda表达式实现eat"));

    }

    public static void useEtable(lambda_demo1.Eatable eatable) {
        eatable.eat();
    }
}
