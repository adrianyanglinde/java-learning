package polymorphism_demo_catdog;

public class Cat extends Animal{
    public String text = "猫";
    public Cat(){}

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    public void setText(String text) {
        this.text = text;
    }
}
