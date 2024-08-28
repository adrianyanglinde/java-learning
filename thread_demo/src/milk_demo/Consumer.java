package milk_demo;

public class Consumer implements Runnable {
    private Boxer boxer = null;

    public Consumer() {

    }

    public Consumer(Boxer boxer) {
        this.boxer = boxer;
    }

    @Override
    public void run() {
        while (true) {
            this.boxer.get();
        }
    }
}
