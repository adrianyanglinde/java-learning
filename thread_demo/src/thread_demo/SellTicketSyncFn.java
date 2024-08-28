package thread_demo;

public class SellTicketSyncFn implements Runnable {
//    private int num = 100;
    private static int num = 100;
    private int flag = 0;
//    public synchronized void sell(){
//        if (num > 0) {
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            System.out.println(Thread.currentThread().getName() + "正在售卖第" + this.num + "几张票");
//            num--;
//        }
//    }
    public static synchronized void sell(){
        if (num > 0) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + "正在售卖第" + num + "几张票");
            num--;
        }
    }
    @Override
    public void run() {
        while (true) {
            if(flag  % 2 == 0){
                synchronized(SellTicketSyncFn.class){
                    if (num > 0) {
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        System.out.println(Thread.currentThread().getName() + "正在售卖第" + this.num + "几张票");
                        num--;
                    }
                }
            }else{
                sell();
            }
            flag++;
        }
    }
}
