package throwable_demo;

public class ScoreException extends Exception{
    public ScoreException() {
    }

    public ScoreException(String message) {
        super(message);
    }
}
