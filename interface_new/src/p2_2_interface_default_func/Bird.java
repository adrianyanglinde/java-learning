package p2_2_interface_default_func;

public class Bird implements Eatable {
    @Override
    public void eat1() {
        System.out.println("bird eat by eat1 way");
    }

    @Override
    public void eat2() {
        System.out.println("bird eat by eat2 way");
    }
}
