package p2_3_interface_static_func;

public class Main {
    public static void main(String[] args) {
        Eatable e = new Cat();
        e.eat();
        e.fakeEat();
//        e.getInterName()

        Eatable.getInterName();
       // Cat.getInterName();
        Sleepable.getInterName();
    }
}
