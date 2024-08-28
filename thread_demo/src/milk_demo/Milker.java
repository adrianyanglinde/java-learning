package milk_demo;

public class Milker implements Runnable {
    private Boxer boxer = null;

    public Milker() {

    }

    public Milker(Boxer boxer) {
        this.boxer = boxer;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            this.boxer.put(i);
        }
    }
}
