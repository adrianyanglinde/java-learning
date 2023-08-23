package polymorphism_demo;

public class Dog extends Animal{
    @Override
    public void eat(){
        System.out.println("狗吃骨头");
    }

    public void lookDog(){
        System.out.println("看门狗");
    }
}
