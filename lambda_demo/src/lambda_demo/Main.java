package lambda_demo;

public class Main {
    /**
     * 1.1体验Lambda表达式
     */
    public static void main(String[] args) {
//方式一 线程类
//        Runnable r = new MyRunable();
//        new Thread(r).start();
        //方式二 匿名内部类
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("多线程程序启动了");
//            }
//        }).start();
        //方式三 Lambda表达式
        new Thread(() -> System.out.println("多线程程序启动了")).start();
    }


}