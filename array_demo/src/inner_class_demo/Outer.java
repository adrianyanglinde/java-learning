package inner_class_demo;

/**
 * day3
 */

/**
 * 04.内部类概述
 * 在类A定义一个类B，B就是内部类
 *
 * 特点：
 * 1.内部类可以访问外部类的成员，包括私有
 * 2.外部类要访问内部类的成员，必须创建对象
 */



/**
 * 05. 成员内部类
 * 根据定义位置不同分为两种：
 * 1. 在类的成员位置，成员内部类
 * 2. 在类的局部位置，局部内部类
 */

public class Outer {
    private int num = 10;
    private class Inner{
        public void show(){
            System.out.println(num);
        }
    }
    public void method(){
        Inner inner = new Inner();
        inner.show();
    }


    public void method2(){
        // 没有修饰符
        class Inner2{
            public void show(){
                System.out.println(num);
            }
        }
        Inner2 inner = new Inner2();
        inner.show();
    }

    /**
     * 07. 匿名内部类（属于局部内部类的一种形式）
     * 前提：存在一个类或者接口
     * 格式：
     * new 类名或接口名(){
     *     重写方法
     * }
     * 本质！：继承了该类或者实现了该接口的 子类匿名对象，是一个匿名类对象
     */

    public void method3(){
        Inter it = new Inter(){
            @Override
            public void show(){
                System.out.println("show");
            }
        };
        it.show();
    }


}




