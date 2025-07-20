package lambda_demo2;

public class FlyableImp implements Flyable {
    @Override
    public void fly(String s) {
        System.out.println(s + "implement fly by class");
    }
}
