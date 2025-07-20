package p2_2_interface_default_func;

public class Cat implements Eatable {
    @Override
    public void eat1() {
        System.out.println("cat eat by eat1 way");
    }

    @Override
    public void eat2() {
        System.out.println("cat eat by eat2 way");
    }

    @Override
    public void eat3() {
        System.out.println("cat eat by eat3 way");
    }
}
