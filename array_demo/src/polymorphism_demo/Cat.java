package polymorphism_demo;

public class Cat extends Animal {
    public int age = 10;
    public int weight = 20;

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
    public void catchMouse(){
        System.out.println("猫抓老鼠");
    }
}
