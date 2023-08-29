package interface_demo;

public class Cat implements Jumping{
    @Override
    public void jump() {
        System.out.println("猫可以跳高");
    }

    @Override
    public void eat() {

    }
}
