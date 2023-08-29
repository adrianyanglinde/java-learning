package athlete_coach_demo;

public abstract class Athlete extends Person{

    public Athlete(String name, int age) {
        super(name, age);
    }

    public abstract void practice();

    @Override
    public void eat() {
        System.out.println("运动员统一在食堂吃饭");
    }
}
