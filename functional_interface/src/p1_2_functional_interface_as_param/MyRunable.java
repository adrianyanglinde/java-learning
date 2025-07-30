package p1_2_functional_interface_as_param;

public class MyRunable implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread() + "启动了");
    }
}
