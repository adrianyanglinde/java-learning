package p1_2_functional_interface_as_param;

public class Main {
    public static void main(String[] args) {
        startTread(new MyRunable());

        startTread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread() + "启动了");
            }
        });
        startTread(() -> System.out.println(Thread.currentThread() + "启动了"));
    }
    public static void startTread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.start();
    }
}