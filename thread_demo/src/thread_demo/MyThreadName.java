package thread_demo;

public class MyThreadName extends Thread{
    public MyThreadName(){

    }
    public MyThreadName(String name){
        this.setName(name);
    }
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(this.getName() + i);
        }
    }
}
