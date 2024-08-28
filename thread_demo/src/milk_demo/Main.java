package milk_demo;

public class Main {
    public static void main(String[] args) {
        Boxer boxer = new Boxer();
        Milker milker = new Milker(boxer);
        Consumer consumer = new Consumer(boxer);

        Thread thread1 = new Thread(milker);
        Thread thread2 = new Thread(consumer);
        thread1.start();
        thread2.start();
    }
}
