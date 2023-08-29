package arg_demo;

/**
 * 02. 抽象类名作为形参和返回值
 * 方法的形参是抽象类名，其实是要该抽象类的子类对象
 * 方法的返回值是抽象类名，其实返回的是该抽象类的子类对象
 */
public class AnimalOper {
    public void useAniaml(Animal a){
        a.eat();
    }
    public Animal getAnimal(){
        return new Cat();
    }
}
