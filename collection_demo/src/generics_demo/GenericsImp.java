package generics_demo;

public class GenericsImp<T> implements GenericesInter<T> {

    @Override
    public void show(T t) {
        System.out.println(t);
    }
}
