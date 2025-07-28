package p2_4_interface_private_fun;

import p2_3_interface_static_func.Cat;
import p2_3_interface_static_func.Eatable;
import p2_3_interface_static_func.Sleepable;

public class Main {
    public static void main(String[] args) {
        Inter i = new InterImp();
        i.func1();
        System.out.println("----");
        i.func2();
        System.out.println("----");
        Inter.show1();
        System.out.println("----");
        Inter.show2();
    }
}
