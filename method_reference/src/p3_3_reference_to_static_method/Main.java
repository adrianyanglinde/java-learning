package p3_3_reference_to_static_method;

public class Main {
    public static void main(String[] args) {
        // int i = useConvert(s -> Integer.parseInt(s));

        useConvert(Integer::parseInt);

    }

    public static void useConvert(Converter converter) {
        int i = converter.convert("713");
        System.out.println(i);
    }
}
