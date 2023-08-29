package athlete_coach_demo;

public abstract class Coach extends Person{

    public Coach(String name, int age) {
        super(name, age);
    }

    public abstract void teach();

    @Override
    public void eat() {
        System.out.println("教练统一在办公室吃饭");
    }
}
