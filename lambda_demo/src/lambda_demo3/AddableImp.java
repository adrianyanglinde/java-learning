package lambda_demo3;

public class AddableImp implements Addable {

    @Override
    public int add(int a, int b) {
        System.out.println("implement by class");
        return a + b;
    }
}
