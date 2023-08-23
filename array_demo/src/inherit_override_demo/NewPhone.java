package inherit_override_demo;

public class NewPhone extends Phone{

    /**
     * 008. 方法重写
     * Override是一个注解，表明这是一个方法重写，覆盖父类的
     */

//    public void call(String name) {
//        System.out.println("开启视频聊天");
//        super.call(name);
//    }
    @Override
    public void call(String name) {
        System.out.println("开启视频聊天");
        super.call(name);
    }

    /**
     * 009. 方法重写注意事项:
     */

    /**
     * 1.父类的私有内容，子类是无法继承到的
     *   所以子类无法重写父类的私有方法，Override报错
     */
//    @Override
//    private void show(){
//        System.out.println("NewPhone类的show方法被调用");
//    }

    /**
     * 2.子类重写方法时，访问权限不比父类低就行（public > 默认 > private）
     */
    @Override
    public void method(){
        System.out.println("NewPhone类的method方法被调用");
    }
}
