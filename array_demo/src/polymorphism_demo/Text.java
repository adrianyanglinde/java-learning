package polymorphism_demo;

/**
 * day2
 */

/**
 * 01.多态概述
 * 同一个对象 在不同时刻表现出来的不同形态
 *
 * 举例：猫
 * 我们可以说猫是猫：猫 cat = new 猫()
 * 我们也可以说猫是动物：动物 animal = new 猫()
 * 这里的猫在不同时刻表现出了不同形态，这就是多态
 */

/**
 * 多态的前提和体现：
 * - 有继承/实现关系
 * - 有方法重写
 * - 有父类引用指向子类对象
 */
public class Text {
    public static void main(String[] args) {

       // 父类引用指向子类对象（虽然内存中的对象是猫，但外界看到的是动物的引用）
        Animal a = new Cat();

        /**
         * 02.多态成员访问特点
         * 多态访问
         * 成员变量：编译要看左边，运行要看左边
         * 成员方法：编译要看左边(Animal有eat方法)，运行要看右边（Cat里eat方法执行）
         * 为什么呢？因为成员方法有重写，成员变量没有
         */
        System.out.println(a.age);
//        System.out.println(a.weight);
        a.eat();
//        a.catchMouse();


        /**
         * 03.多态优缺点
         * （见AnimalOperate类）
         */
        AnimalOperate ao = new AnimalOperate();
        Cat cat = new Cat();
        ao.useAnimal(cat);
        Dog dog = new Dog();
        ao.useAnimal(dog);
        Pig pig = new Pig();
        ao.useAnimal(pig);

        /**
         * 04. 多态的转型（为了解决多态不能使用子类的特有功能弊端）
         * - 向上转型 父类引用指向子类对象
         * - 向下转型 父类引用转为子类对象
         */
        Animal a1 = new Cat(); // 向上转型
        a1.eat();
        // a1.catchMouse();

        Cat c = (Cat)a1;  // 向下转型
        c.eat();
        c.catchMouse();




        a1 = new Dog(); // 向上转型
        a1.eat();

//        Cat cc = (Cat)a1;  // 向下转型，狗不能转为猫
//        cc.eat();
//        cc.catchMouse();

        /**
         * 05. 多态内存图
         */

    }
}
