package lambda_demo;

public class MyRunable implements Runnable{
    @Override
    public void run() {
        System.out.println("多线程程序启动了");
    }
}
