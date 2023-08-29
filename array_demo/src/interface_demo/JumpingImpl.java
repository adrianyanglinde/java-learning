package interface_demo;

// public class JumpingImpl implements Jumping 效果等同如下
// 所有类都直接或者间接继承自Object类，所有构造方法默认访问父类的无参构造方法，因为祖宗只有无参构造方法

public class JumpingImpl extends Object implements Jumping{

    public JumpingImpl() {
        // super();
    }

    @Override
    public void jump() {

    }

    @Override
    public void eat() {

    }
}
