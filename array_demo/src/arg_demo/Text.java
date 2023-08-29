package arg_demo;

public class Text {
    public static void main(String[] args) {
        CatOper co = new CatOper();
        Cat cat1 = co.getCat();
        co.useCat(cat1);

        AnimalOper ao = new AnimalOper();
        Animal cat2 = ao.getAnimal();
        ao.useAniaml(cat2);

        JumpingOper jo = new JumpingOper();
        Jumping cat3 = jo.getJumping();
        jo.useJump(cat3);
    }
}
