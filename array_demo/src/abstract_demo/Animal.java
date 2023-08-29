package abstract_demo;

/**
 * 07. 抽象类
 * 动物本身不是具体的事物而是抽象的事物
 * 应该不给吃的具体方法实现，而给吃的方法声明，不给方法体
 *
 * 在java中 一个没有方法体的方法应该定义为抽象方法
 * 而类中有抽象方法，则该类必须定义为抽象类
 */

public abstract class Animal {

    // 抽象方法
    public abstract void eat();

    /**
     * 08. 抽象类特点
     * 1.象类中不一定有抽象方法，有抽象方法的类一定是抽象类
     * 2.抽象类不能直接实例化
     *      参照多态的方式，通过子类对象实例化，这叫抽象类对态
     * 3.抽象类的子类
     *      要么重写抽象类中的所有方法
     *      要么是抽象类
     */
    public void sleep(){
        System.out.println("睡觉");
    }


    /**
     * 08. 抽象类成员特点
     * 构造方法：
     *      本身不能实例化
     *      用于子类访问父类数据的初始化
     * 成员方法：
     *      抽象方法限定子类必须完成某些动作
     *      非抽象方法提高代码复用性
     */
    private int age = 20;   // 变量
    private final String city = "北京";  // 常量
    public Animal(){};
    public Animal(int age) {
        this.age = age;
    }
    public void eat1(){

    }
    public abstract void eat2();

}
