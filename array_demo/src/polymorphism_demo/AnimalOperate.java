package polymorphism_demo;

public class AnimalOperate {


//    public void useAnimal(Cat cat){
//        cat.eat();
//    }
//    public void useAnimal(Dog dog){
//        dog.eat();
//    }
//    public void useAnimal(Pig pig){
//        pig.eat();
//    }

    /**
     * 多态好处：提高程序的扩展性
     *      定义方法的时候，使用父类型作为参数，将来使用的时候，使用具体的子类型参与操作
     * 多态弊端：不能使用子类的特有功能
     */
    public void useAnimal(Animal animal){
        animal.eat();
        //animal.lookDog();
    }
}
