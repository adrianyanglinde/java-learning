package inherit_override_demo;

public class Phone {
    public void call(String name){
        System.out.println("给" + name+ "打电话");
    }

    private void show(){
        System.out.println("Phone类的show方法被调用");
    }

    void method(){
        System.out.println("Phone类的method方法被调用");
    }
}
