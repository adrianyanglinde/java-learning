package class_demo_1;

public class Student {

    String name;
    private int age;

    /**
     * 构造方法
     * 作用：对象数据初始化
     * 注意：
     *  1.当类中没有定义构造方法，系统会自动给个无参构造方法
     *  2.最好自己给个无参构造方法
     */
    public Student(){
        System.out.println("构造方法1");
    }
    public Student(String name,int age){
        System.out.println("构造方法2");
        this.name = name;
        this.age = age;
    }


    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setAge(int a){
        /**
         * 没有同名局部变量，不用this修饰，也是指代成员变量
         */
        age = a;
    }
    public int getAge(){
        return age;
    }


    public void doHomework(){
        System.out.println("do hoemwork");
    }
    public void study(){
        System.out.println("do study");
    }
    public void show(){
        System.out.println(name + "," +age);
    }

    /**
     * 成员变量&局部变量
     * 位置：类中方法外&方法内，方法声明上（型参）
     * 内存：堆内存&栈内存
     * 生命周期：跟着对象&跟着方法
     * 初始化值：有&无
     */


}
