package thread_demo;

public class SellTicket implements Runnable{
    private int num = 100;


    @Override
    public void run() {
        while (true){
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
    }
}
