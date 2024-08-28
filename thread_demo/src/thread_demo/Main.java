package thread_demo;

public class Main {
    public static void main(String[] args) {
        sleep();
    }

    /**
     * 02_继承Thread类的方式实现多线程
     */
    public static void create(){
        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();
        myThread1.start();
        myThread2.start();
    }

    /**
     * 03_设置和获取线程名称
     */

    public static void name(){
        MyThreadName myThread1 = new MyThreadName("飞机");
        MyThreadName myThread2 = new MyThreadName("高铁");
//        myThread1.setName("飞机");
//        myThread2.setName("高铁");
        myThread1.start();
        myThread2.start();
        System.out.println(Thread.currentThread().getName());
    }

    /**
     * 04_线程优先级
     */
    public static void priority(){
        MyThreadName myThread3 = new MyThreadName("汽车");
        MyThreadName myThread2 = new MyThreadName("高铁");
        MyThreadName myThread1 = new MyThreadName("飞机");

        myThread1.setPriority(10);
        myThread2.setPriority(5);
        myThread3.setPriority(1);

        myThread3.start();
        myThread2.start();
        myThread1.start();

    }
    /**
     * 05_线程控制
     */
    public static void sleep(){
        MyThreadSleep myThread3 = new MyThreadSleep("曹擦");
        MyThreadSleep myThread2 = new MyThreadSleep("刘备");
        MyThreadSleep myThread1 = new MyThreadSleep("孙权");
        myThread3.start();
        myThread2.start();
        myThread1.start();
    }
    public static void dead(){
        MyThreadName myThread3 = new MyThreadName("康熙");
        MyThreadName myThread2 = new MyThreadName("四阿哥");
        MyThreadName myThread1 = new MyThreadName("八阿哥");
        myThread3.start();
        try {
            myThread3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        myThread2.start();
        myThread1.start();
    }
    public static void daemon(){
        MyThreadName myThread3 = new MyThreadName("张飞");
        MyThreadName myThread2 = new MyThreadName("关羽");
       //   MyThreadName myThread1 = new MyThreadName("刘备");
        myThread3.setDaemon(true);
        myThread2.setDaemon(true);
       //  myThread1.start();
        myThread3.start();
        myThread2.start();

        Thread.currentThread().setName("刘备");
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + i);
        }

    }

    /**
     * 07_实现Runnable接口的方式实现多线程
     */
    public static void createByRunable(){
        MyServer myServer = new MyServer();
        Thread thread1 = new Thread(myServer,"飞机");
        Thread thread2 = new Thread(myServer,"高铁");
        thread1.start();
        thread2.start();
    }

    /**
     * 08_卖票
     * 09_卖票案例的思考
     * 10_同步代码块解决数据安全问题
     * 13_Lock锁
     */
    public static void sellTicketDemo(){
        // SellTicket sellTicket = new SellTicket();
//        SellTicketSync sellTicket = new SellTicketSync();
//        SellTicketSyncFn sellTicket = new SellTicketSyncFn();
        SellTicketLock sellTicket = new SellTicketLock();
        Thread thread1 = new Thread(sellTicket,"窗口一");
        Thread thread2 = new Thread(sellTicket,"窗口二");
        Thread thread3 = new Thread(sellTicket,"窗口三");
        thread1.start();
        thread2.start();
        thread3.start();
    }



}
