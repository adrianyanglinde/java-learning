package inherit_demo;

public class Fu {
    public int age = 40;

    public Fu(){
        System.out.println("父类无参构造方法的this" + this);
        System.out.println("父类无参构造方法被调用");
    }

    public Fu(int age){
        System.out.println("父类带参构造方法被调用");
    }

    public void method1(){
        System.out.println("父类成员方法被调用");
    }

    /**
     * TODO：父类this指向子
     */
    public void testThis(){
        System.out.println("父类成员方法的this" + this);
    }
}
