package p2_4_interface_private_fun;

public interface Inter {

//    private void func(){
//        System.out.println("loading1");
//        System.out.println("loading2");
//        System.out.println("loading3");
//    }
//    private static void show(){
//        System.out.println("loading1");
//        System.out.println("loading2");
//        System.out.println("loading3");
//    }

    default void func1() {
        System.out.println("func1 start");
//        System.out.println("loading1");
//        System.out.println("loading2");
//        System.out.println("loading3");
        //show();
        //func();
        System.out.println("func1 end");
    }
    default void func2() {
        System.out.println("func2 start");
//        System.out.println("loading1");
//        System.out.println("loading2");
//        System.out.println("loading3");
        //show();
        //func();
        System.out.println("func2 end");
    }
    static void show1() {
        System.out.println("show1 start");
//        System.out.println("loading1");
//        System.out.println("loading2");
//        System.out.println("loading3");
        //show();
        //func();
        System.out.println("show1 end");
    }
    static void show2() {
        System.out.println("show2 start");
//        System.out.println("loading1");
//        System.out.println("loading2");
//        System.out.println("loading3");
       // show();
        //func();
        System.out.println("show2 end");
    }
}
