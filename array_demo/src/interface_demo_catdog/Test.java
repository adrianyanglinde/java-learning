package interface_demo_catdog;

public class Test {
    public static void main(String[] args) {
//        Jummping j = new Cat();
//        j.jump();
        Animal a = new Cat();
        a.setAge(10);
        a.setName("加菲");
        System.out.println(a.getName() + a.getAge());
        a.eat();
        ((Cat) a).jump();

        /**
         * 实际使用
         */
        Cat cat = new Cat();
    }
}
