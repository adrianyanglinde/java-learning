package p1_8_lambda_anonymous;

public class Main {
    public static void main(String[] args) {
        useInter(new Inter() {
            @Override
            public void show() {
                System.out.println("implement interface by anonymous class");
            }
//            @Override
//            public void eat() {
//                System.out.println("implement interface eat by anonymous class");
//            }
        });
        useInter(() -> System.out.println("implement interface by lambda"));

        useAnimal(new Animal() {
            @Override
            void eat() {
                System.out.println("implement abstract by anonymous class");
            }
        });
        //useAnimal(()->System.out.println("implement abstract by lambda"));

        useBird(new Bird(){
            @Override
            void eat() {
                System.out.println("override class by anonymous class");
            }
        });
        //useBird(()->System.out.println("override class by lambda"));
    }

    public static void useInter(Inter inter) {
        inter.show();
    }
    public static void useAnimal(Animal animal) {
        animal.eat();
    }
    public static void useBird(Bird bird) {
        bird.eat();
    }
}
