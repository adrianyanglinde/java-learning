package interface_demo;

/**
 * 11. 接口概述
 * 接口就是一种公共的规范标准
 * java中的接口更多体现在对行为的抽象
 */

/**
 * 12. 接口特点
 * 1. 接口不能实例化
 *      参照多态的方式，通过实现类对象实例化，这叫接口多态
 *      多态的形式：具体类多态，抽象类多态，接口多态
 *      多态的前提：有继承或者实现关系；有方法重写；有父（类/接口）引用指向（子/实现）类对象
 * 2. 接口的实现类
 *      要么重写抽象类中的所有方法
 *      要么是抽象类
 */

public interface Jumping {
    public abstract void jump();

    /**
     * 13. 接口的成员特点
     * 成员变量：
     *      只能是常量，默认被public static final修饰
     * 构造方法：
     *      没有构造方法，因为接口主要是对行为进行抽象，没有具体的存在
     *      一个类如果没有父类，默认继承自Object类
     * 成员方法：
     *      只能是抽象方法，默认被public abstract修饰
     */

    public int num = 10;
    public final int num2 = 20;

    // public static final int num3 = 90; 默认被final和static修饰，等价如下
    int num3 = 90;

//    public void eat(){}  不能有方法体
//    public abstract void eat2(); 默认被abstract修饰，等价如下
    void eat();
}
