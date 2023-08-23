package polymorphism_demo_catdog;

public class Test {
    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.setName("加菲猫");
        cat.setAge(10);
        System.out.println(cat.text);
        cat.setText("猫猫");
        System.out.println(cat.text);
        System.out.println(((Cat) cat).text);
    }
}
