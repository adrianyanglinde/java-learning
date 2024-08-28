package thread_demo;

public class MyThreadSleep extends Thread{
    public MyThreadSleep(){

    }
    public MyThreadSleep(String name){
        this.setName(name);
    }
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(this.getName() + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
