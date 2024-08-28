package milk_demo;

public class Boxer {
    private int milk = 0;
    private boolean light = false;

    public synchronized void put(int milk){
        if(this.light){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        this.milk = milk;
        this.light = true;
        notifyAll();
    }
    public synchronized void get(){
        if(!this.light){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("用户取到第" + milk+ "瓶奶");
        this.light = false;
        notifyAll();
    }
}
