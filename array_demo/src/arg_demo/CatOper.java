package arg_demo;

/**
 * 01. 类名作为形参和返回值
 * 方法的形参是类名，其实是要该类的对象
 * 方法的返回值是类名，其实返回的是该类的对象
 */
public class CatOper {
    public void useCat(Cat c){
        c.eat();
    }
    public Cat getCat(){
        return new Cat();
    }
}
