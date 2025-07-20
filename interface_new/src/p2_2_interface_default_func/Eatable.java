package p2_2_interface_default_func;

public interface Eatable {
    void eat1();

    void eat2();

    default void eat3(){
        System.out.println("eat by eat3 way");
    };
}
