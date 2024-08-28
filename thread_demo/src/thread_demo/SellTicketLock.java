package thread_demo;

import java.util.concurrent.locks.ReentrantLock;

public class SellTicketLock implements Runnable{
    private int num = 100;
    private ReentrantLock lock = new ReentrantLock();


    @Override
    public void run() {
        while (true){
            try{
                lock.lock();
                if (num > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(Thread.currentThread().getName() + "正在售卖第" + this.num + "几张票");
                    num--;
                }
            }finally {
                lock.unlock();
            }
        }
    }
}
