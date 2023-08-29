package inner_class_demo;

public class Test {
    public static void main(String[] args) {
        /**
         * 成员内部类，外部使用格式（不常见）
         */
//        Outer.Inner oi = new Outer().new Inner();
//        oi.show();
        /**
         * 一般内部类定义为私有，通过方法暴露给外界
         */
        Outer o = new Outer();
        o.method();


        o.method2();

        o.method3();


        /**
         * 08. 匿名内部类在开发中的使用
         * 不用每次都去定义一个类
         */
        JumpOper jo = new JumpOper();
//        Jumping cat = new Cat();
//        jo.useJumping(cat);
//        Jumping dog = new Dog();
//        jo.useJumping(dog);
        jo.useJumping(new Jumping() {
            @Override
            public void jump() {
                System.out.println("猫会跳");
            }
        });

        jo.useJumping(new Jumping() {
            @Override
            public void jump() {
                System.out.println("狗会跳");
            }
        });


    }
}
