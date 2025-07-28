package p2_3_interface_static_func;

public interface Eatable {

    void eat();

    default void fakeEat(){
        System.out.println("Eatable default method:fakeEat");
    }

    static void getInterName(){
        System.out.println("Eatable static method:getInterName");
    }


}
