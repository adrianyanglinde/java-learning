package inherit_demo;

/**
 * 002.继承的好处和弊端
 * 弊端：子类和父类产生关联，耦合增强，子类不得不随着父类改变而改变，削弱独立性
 *
 * 什么时候使用？
 * 继承体现关系：is a
 */

public class Zi extends Fu{
    public int age = 20;

    public void show(){
        int age = 30;

        /**
         * 003.继承中变量访问特点
         * 子类方法中访问一个变量：子类局部范围内找=> 子类成员范围=> 父类成员范围
         */

        /**
         * 004.super关键字
         * this.代表本类对象引用（this关键字指向调用该方法的对象，一般是在当前类使用，所以常说this代表本类对象引用）
         * super.代表父类存储空间标识（可以理解为父类对象引用）
         */
        // 子类方法中访问一个变量：子类局部范围内找=> 子类成员范围=> 父类成员范围
        System.out.println(age);
        // 我要访问本类的成员变量
        System.out.println(this.age);
        // 我要访问父类的成员变量
        System.out.println(super.age);
    }

    /**
     * 005.继承中构造方法访问特点
     * 1.子类所有构造方法默认访问父类无参构造方法
     *      - 子类初始化前，要完成父类的初始化
     *      - 每一个子类构造方法的第一条默认语句都是super();
     * 2.如果父类没有（显示声明）无参构造方法，只有带参构造方法
     *      - 通过super关键字去显示调用带参数构造方法
     *      - 父类自己给无参构造方法（推荐）
     */
    public Zi(){
//        super();
        System.out.println("子类无参构造方法被调用");
    }

    public Zi(int age){
//        super();
        // 指定父中带参构造方法
        super(20);
        System.out.println("子类带参构造方法被调用");
    }


    /**
     * 006.继承中成员方法的访问特点
     * 子类成员范围内找=> 父类成员范围找
     */
    public void method1(){
        System.out.println("子类成员方法被调用");
    }

    /**
     * 007.super内存图
     * 注意：构造方法成员方法加载到栈内存
     */

//    public void testThis(){
//        System.out.println("子类成员方法的this" + this.age);
//    }

    /**
     * 010. 继承的注意事项
     * Java中 类只支持单继承，不支持多继承
     */
}
